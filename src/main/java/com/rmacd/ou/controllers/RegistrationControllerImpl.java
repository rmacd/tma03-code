package com.rmacd.ou.controllers;

import com.rmacd.ou.facades.AttendeeFacade;
import com.rmacd.ou.facades.EventFacade;
import com.rmacd.ou.facades.RegistrationFacade;
import com.rmacd.ou.generated.Attendee;
import com.rmacd.ou.generated.Event;
import org.springframework.stereotype.Component;

@Component
public class RegistrationControllerImpl implements RegistrationController {

    final RegistrationFacade registrationFacade;
    final AttendeeFacade attendeeFacade;
    final EventFacade eventFacade;

    public RegistrationControllerImpl(
            RegistrationFacade registrationFacade,
            AttendeeFacade attendeeFacade,
            EventFacade eventFacade) {
        this.registrationFacade = registrationFacade;
        this.attendeeFacade = attendeeFacade;
        this.eventFacade = eventFacade;
    }

    @Override
    public void createEventRegistration(String currentUser, String eventId) {
        Attendee attendee = attendeeFacade.getAttendeeByEmail(currentUser);
        Event event = eventFacade.findEventByEventId(eventId);
        registrationFacade.createEventRegistration(attendee, event);
    }
}
