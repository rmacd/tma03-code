package com.rmacd.ou.repos;

import models.generated.Attendee;
import models.generated.Event;

public interface RegistrationController {
    void registerAttendeeForEvent(Attendee attendee, Event event);
}
