package booking.ticket.repository;

import booking.ticket.domain.Event;

import java.time.LocalDateTime;
import java.util.List;

public interface EventRepository extends GenericEventRepository<Event> {

    List<Event> findAllByDateBetween(LocalDateTime startDate, LocalDateTime endDate);

}
