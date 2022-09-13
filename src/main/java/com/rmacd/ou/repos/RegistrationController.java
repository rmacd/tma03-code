package com.rmacd.ou.repos;

import com.rmacd.ou.generated.Attendee;
import com.rmacd.ou.generated.Event;

public interface RegistrationController {
    void registerAttendeeForEvent(Attendee attendee, Event event);
}
