package com.rmacd.ou.facades;

import com.rmacd.ou.generated.Attendee;
import com.rmacd.ou.generated.Event;

public interface RegistrationFacade {
    void createEventRegistration(Attendee attendee, Event event);
}
