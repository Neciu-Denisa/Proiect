package booking.ticket.repository;

import booking.ticket.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    long countAllByEventId(int id);
}
