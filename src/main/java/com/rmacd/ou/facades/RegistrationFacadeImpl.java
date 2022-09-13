package com.rmacd.ou.facades;

import com.rmacd.ou.generated.Attendee;
import com.rmacd.ou.generated.Event;
import com.rmacd.ou.generated.Registration;
import com.rmacd.ou.repos.RegistrationRepo;

public class RegistrationFacadeImpl implements RegistrationFacade {

    final RegistrationRepo registrationRepo;

    // inject the Registration JPA interface
    public RegistrationFacadeImpl(RegistrationRepo registrationRepo) {
        this.registrationRepo = registrationRepo;
    }

    @Override
    public void createEventRegistration(Attendee attendee, Event event) {
        Registration registration = new Registration(attendee, event);
        if (registrationRepo.existsById(registration.getId())) {
            throw new IllegalArgumentException("Attendee already registered");
        }
        // persist the object
        registrationRepo.save(registration);
    }
}
