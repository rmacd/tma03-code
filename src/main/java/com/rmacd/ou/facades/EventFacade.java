package com.rmacd.ou.facades;

import com.rmacd.ou.generated.Event;

public interface EventFacade {
    Event findEventByEventId(String eventId);
}
