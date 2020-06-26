package booking.ticket.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    private long cnp;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }
}
