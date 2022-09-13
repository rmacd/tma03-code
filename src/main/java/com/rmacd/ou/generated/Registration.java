package com.rmacd.ou.generated;

import javax.persistence.Entity;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "REGISTRATIONS")
public class Registration {

    @Id
    private String id;
    private LocalDateTime registered;
    @OneToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    private Event event;
    @OneToOne
    @JoinColumn(name = "attendee_id", referencedColumnName = "email")
    private Attendee attendee;

    // no-args constructor required for JPA
    protected Registration() {
    }

    public Registration(Attendee attendee, Event event) {
        this.id = String.format("%s_%s", attendee.getEmail(), event.getId());
        this.attendee = attendee;
        this.event = event;
        this.registered = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getRegistered() {
        return registered;
    }
}