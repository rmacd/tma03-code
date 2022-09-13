package com.rmacd.ou.facades;

import com.rmacd.ou.generated.Event;
import com.rmacd.ou.repos.EventRepo;
import org.springframework.stereotype.Component;

@Component
public class EventFacadeImpl implements EventFacade {

    final EventRepo eventRepo;

    public EventFacadeImpl(EventRepo eventRepo) {
        this.eventRepo = eventRepo;
    }

    @Override
    public Event findEventByEventId(String eventId) {
        return eventRepo.findById(eventId).orElseThrow();
    }
}
