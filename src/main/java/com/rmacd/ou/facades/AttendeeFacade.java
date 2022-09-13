package com.rmacd.ou.facades;

import com.rmacd.ou.generated.Attendee;

public interface AttendeeFacade {
    Attendee getAttendeeByEmail(String email);
}
