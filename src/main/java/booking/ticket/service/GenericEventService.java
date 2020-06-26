package booking.ticket.service;

import booking.ticket.domain.AbstractEntity;
import booking.ticket.repository.GenericEventRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public class GenericEventService<T extends AbstractEntity> {

    private final GenericEventRepository<T> eventRepository;

    public GenericEventService(GenericEventRepository<T> eventRepository) {
        this.eventRepository = eventRepository;
    }

    public T addEvent(T event){

        return eventRepository.save(event);

    }

    public List<T> getAllEvents(){

        return eventRepository.findAll();

    }

    public T getEventById(int id) {

        return eventRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Event does not exist!"));

    }

    public void deleteEvent(int eventId){

        eventRepository.deleteById(eventId);

    }

}
