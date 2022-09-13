package com.rmacd.ou.generated;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity // will default to creating a table 'registrations'
public class Registration {

    @Id
    private String id;
    private LocalDateTime registered;
    private String eventId;
    private String attendeeId;

    // no-args constructor required for JPA
    protected Registration() {
    }

    public Registration(Attendee attendee, Event event) {
        this.eventId = event.getId();
        this.attendeeId = attendee.getEmail();
        this.id = String.format("%s_%s", attendeeId, eventId);
        this.registered = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getRegistered() {
        return registered;
    }

    public String getEventId() {
        return eventId;
    }

    public String getAttendeeId() {
        return attendeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registration that = (Registration) o;
        return id.equals(that.id) && eventId.equals(that.eventId) && attendeeId.equals(that.attendeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventId, attendeeId);
    }
}