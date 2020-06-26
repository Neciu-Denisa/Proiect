package booking.ticket.controller;

import booking.ticket.domain.StandUp;
import booking.ticket.service.StandUpService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/standUp")
public class StandUpController extends GenericEventController<StandUp> {

    public StandUpController(StandUpService standUpService){
        super(standUpService);
    }
}
