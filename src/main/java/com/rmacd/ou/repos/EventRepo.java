package com.rmacd.ou.repos;

import com.rmacd.ou.generated.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo extends JpaRepository<Event, String> {
}
