package booking.ticket.domain;

import javax.persistence.Entity;

@Entity
public class Person extends AbstractEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
