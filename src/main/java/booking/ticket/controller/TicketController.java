package booking.ticket.controller;

import booking.ticket.domain.Ticket;
import booking.ticket.service.TicketService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping
    public Ticket addTicket(@RequestBody Ticket ticket){

        return ticketService.addTicket(ticket);

    }

    @DeleteMapping("/{ticketId}")
    public void deleteTicket(@PathVariable int ticketId){

        ticketService.deleteTicket(ticketId);

    }

    @GetMapping("/{id}")
    public Ticket getTicketById(@PathVariable int id){

        return ticketService.getTicketById(id);

    }

    @PutMapping("/{ticketId}/discount")
    public Ticket discountPriceByAge(@PathVariable int ticketId){

        return ticketService.discountPriceByAge(ticketId);

    }

}
