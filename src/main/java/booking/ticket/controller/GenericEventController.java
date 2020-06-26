package booking.ticket.controller;

import booking.ticket.domain.AbstractEntity;
import booking.ticket.service.GenericEventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GenericEventController<T extends AbstractEntity> {

    private final GenericEventService<T> eventService;

    public GenericEventController(GenericEventService<T> eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public T addEvent(@RequestBody T event){

        return eventService.addEvent(event);

    }


    @GetMapping
    public List<T> getAllEvents(){

        return eventService.getAllEvents();

    }

    @GetMapping("/{id}")
    public T getEventById(@PathVariable int id){

        return eventService.getEventById(id);

    }

    @DeleteMapping("/{eventId}")
    public void deleteEvent(@PathVariable int eventId){

        eventService.deleteEvent(eventId);

    }

}
