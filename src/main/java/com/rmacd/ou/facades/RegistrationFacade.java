package com.rmacd.ou.facades;

import models.generated.Attendee;
import models.generated.Event;

public interface RegistrationFacade {
    void createEventRegistration(Attendee attendee, Event event);
}
