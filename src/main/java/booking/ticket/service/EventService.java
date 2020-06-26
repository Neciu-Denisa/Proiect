package booking.ticket.service;

import booking.ticket.domain.Event;
import booking.ticket.repository.EventRepository;
import booking.ticket.repository.TicketRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDate;
import java.util.List;

@Service
public class EventService extends GenericEventService<Event> {

    private final EventRepository eventRepository;
    private final TicketRepository ticketRepository;

    public EventService(EventRepository eventRepository, TicketRepository ticketRepository) {
        super(eventRepository);
        this.eventRepository = eventRepository;
        this.ticketRepository = ticketRepository;
    }

    public long availableSeatsNumber(int eventId){

        Event event = getEventById(eventId);
        return event.getLoc().getNumberOfSeats() - ticketRepository.countAllByEventId(eventId);

    }

    public List<Event> getAllEventsInDay(LocalDate date){

        return eventRepository.findAllByDateBetween(date.atStartOfDay(), date.plusDays(1).atStartOfDay());

    }
}
