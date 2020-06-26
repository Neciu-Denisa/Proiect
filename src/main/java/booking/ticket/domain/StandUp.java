package booking.ticket.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class StandUp extends Event {

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Person> comedians = new HashSet<Person>();

    public Set<Person> getComedians() {
        return comedians;
    }

    public void setComedians(Set<Person> comedians) {
        this.comedians = comedians;
    }
}
