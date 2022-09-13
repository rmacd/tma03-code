package com.rmacd.ou.facades;

import com.rmacd.ou.repos.RegistrationRepo;
import models.generated.Attendee;
import models.generated.Event;

public class RegistrationFacadeImpl implements RegistrationFacade {

    final RegistrationRepo registrationRepo;

    // inject the Registration JPA interface
    public RegistrationFacadeImpl(RegistrationRepo registrationRepo) {
        this.registrationRepo = registrationRepo;
    }

    @Override
    public void createEventRegistration(Attendee attendee, Event event) {

    }
}
