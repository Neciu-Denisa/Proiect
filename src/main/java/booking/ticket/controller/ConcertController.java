package booking.ticket.controller;

import booking.ticket.domain.Concert;
import booking.ticket.service.ConcertService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/concerts")
public class ConcertController extends GenericEventController<Concert>{

    public ConcertController(ConcertService concertService) {
        super(concertService);
    }
}
