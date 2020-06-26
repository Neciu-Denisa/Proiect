package booking.ticket.repository;

import booking.ticket.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
