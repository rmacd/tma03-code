package com.rmacd.ou.facades;

import com.rmacd.ou.generated.Attendee;
import com.rmacd.ou.repos.AttendeeRepo;
import org.springframework.stereotype.Component;

@Component
public class AttendeeFacadeImpl implements AttendeeFacade {

    final AttendeeRepo attendeeRepo;

    public AttendeeFacadeImpl(AttendeeRepo attendeeRepo) {
        this.attendeeRepo = attendeeRepo;
    }

    @Override
    public Attendee getAttendeeByEmail(String email) {
        return attendeeRepo.findByEmail(email);
    }
}
