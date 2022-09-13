package com.rmacd.ou.generated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "ATTENDEES")
public class Attendee extends Person {

    @Id
    // is defined in our abstract class
    // but annotation must be in same class
    // as entity, therefore we include here
    // as well
    private String email;
    private String biography;
    private byte[] photo;

    public String getBiography() {
        return this.biography;
    }

    /**
     * @param biography
     */
    public void setBiography(String biography) {
        this.biography = biography;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attendee attendee = (Attendee) o;
        return Objects.equals(email, attendee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}