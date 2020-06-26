package booking.ticket.controller;

import booking.ticket.domain.Event;
import booking.ticket.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController extends GenericEventController<Event>{

    private final EventService eventService;

    public EventController(EventService eventService) {
        super(eventService);
        this.eventService = eventService;
    }

    @GetMapping("/{eventId}/remaining-tickets")
    public long availableSeatsNumber(@PathVariable int eventId){

        return eventService.availableSeatsNumber(eventId);

    }

    @GetMapping("/find-by-date/{dateAsString}")
    public List<Event> getAllEventsInDay(@PathVariable String dateAsString){

        LocalDate date = LocalDate.parse(dateAsString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        return eventService.getAllEventsInDay(date);

    }
}
