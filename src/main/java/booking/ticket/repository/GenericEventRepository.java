package booking.ticket.repository;

import booking.ticket.domain.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericEventRepository<T extends AbstractEntity> extends JpaRepository<T, Integer> {
}
