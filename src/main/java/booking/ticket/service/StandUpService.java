package booking.ticket.service;

import booking.ticket.domain.StandUp;
import booking.ticket.repository.StandUpRepository;
import org.springframework.stereotype.Service;

@Service
public class StandUpService extends GenericEventService<StandUp>{

    public StandUpService(StandUpRepository standUpRepository) {
        super(standUpRepository);
    }

}
