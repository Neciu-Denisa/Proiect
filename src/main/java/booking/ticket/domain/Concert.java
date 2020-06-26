package booking.ticket.domain;

import javax.persistence.Entity;

@Entity
public class Concert extends Event {

    private String band;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }
}
