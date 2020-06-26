package booking.ticket.service;

import booking.ticket.domain.Ticket;
import booking.ticket.repository.TicketRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket addTicket(Ticket ticket){

        applyDiscount(ticket);
        return ticketRepository.save(ticket);

    }

    public void deleteTicket(int ticketId){

        ticketRepository.deleteById(ticketId);

    }

    public Ticket getTicketById(int id) {

        return ticketRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Ticket does not exist!"));

    }

    public Ticket discountPriceByAge(int ticketId){

        Ticket ticket = getTicketById(ticketId);
        applyDiscount(ticket);
        return ticketRepository.save(ticket);
    }

    private void applyDiscount(Ticket ticket) {
        int age = ticket.getClient().getAge();
        float price = ticket.getPrice();
        if (age<=6) {
            ticket.setPrice(0);
        }
        else if (age<=19) {
            ticket.setPrice(price/2);
        }
            else if (60<=age) {
                ticket.setPrice(price*7/10);
        }
    }

}
