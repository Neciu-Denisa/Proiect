package booking.ticket.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Movie extends Event {

    private String dirname;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Person> actors;

    public String getDirname() {
        return dirname;
    }

    public void setDirname(String dirname) {
        this.dirname = dirname;
    }

    public List<Person> getActors() {
        return actors;
    }

    public void setActors(List<Person> actors) {
        this.actors = actors;
    }
}
