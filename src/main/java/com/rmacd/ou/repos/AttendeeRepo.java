package com.rmacd.ou.repos;

import com.rmacd.ou.generated.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeRepo extends JpaRepository<Attendee, String> {
    Attendee findByEmail(String email);
}
