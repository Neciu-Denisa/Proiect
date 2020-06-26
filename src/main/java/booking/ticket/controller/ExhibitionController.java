package booking.ticket.controller;

import booking.ticket.domain.Exhibition;
import booking.ticket.service.ExhibitionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exhibitions")
public class ExhibitionController extends GenericEventController<Exhibition> {

    public ExhibitionController(ExhibitionService exhibitionService) {
        super(exhibitionService);
    }
}
