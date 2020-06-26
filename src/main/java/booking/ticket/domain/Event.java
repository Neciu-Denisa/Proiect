package booking.ticket.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Event extends AbstractEntity{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime date;
    private String name;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Location loc;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }
}
