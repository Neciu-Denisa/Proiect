package booking.ticket.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ticket extends AbstractEntity{

    private float price;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Customer client;
    @ManyToOne
    private Event event;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Customer getClient() {
        return client;
    }

    public void setClient(Customer client) {
        this.client = client;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
