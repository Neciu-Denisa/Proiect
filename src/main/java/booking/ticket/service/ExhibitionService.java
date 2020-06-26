package booking.ticket.service;

import booking.ticket.domain.Exhibition;
import booking.ticket.repository.ExhibitionRepository;
import org.springframework.stereotype.Service;

@Service
public class ExhibitionService extends GenericEventService<Exhibition>{

    public ExhibitionService(ExhibitionRepository exhibitionRepository) {
        super(exhibitionRepository);
    }
}
