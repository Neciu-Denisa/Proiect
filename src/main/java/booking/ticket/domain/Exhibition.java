package booking.ticket.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Exhibition extends Event {

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Person> artists;

    public List<Person> getArtists() {
        return artists;
    }

    public void setArtists(List<Person> artists) {
        this.artists = artists;
    }
}
