package booking.ticket.service;

import booking.ticket.domain.Concert;
import booking.ticket.repository.ConcertRepository;
import org.springframework.stereotype.Service;

@Service
public class ConcertService extends GenericEventService<Concert>{

    public ConcertService(ConcertRepository concertRepository) {
        super(concertRepository);
    }
}
