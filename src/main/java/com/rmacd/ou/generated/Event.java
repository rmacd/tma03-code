package com.rmacd.ou.generated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "EVENTS")
public class Event {

    @Id
    private String id;
    private String title;
    private LocalDateTime start;
    private LocalDateTime end;
    private EventType type;
    private Integer cpdCreditMins;
    private URL meetingLink;
    private Integer capacity;

    public LocalDateTime getStart() {
        return this.start;
    }

    /**
     * @param start
     */
    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return this.end;
    }

    /**
     * @param end
     */
    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public EventType getType() {
        return this.type;
    }

    /**
     * @param type
     */
    public void setType(EventType type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public Event setId(String id) {
        this.id = id;
        return this;
    }

    public Integer getCpdCreditMins() {
        return cpdCreditMins;
    }

    public Event setCpdCreditMins(Integer cpdCreditMins) {
        this.cpdCreditMins = cpdCreditMins;
        return this;
    }

    public URL getMeetingLink() {
        return meetingLink;
    }

    public Event setMeetingLink(URL meetingLink) {
        this.meetingLink = meetingLink;
        return this;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Event setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Event setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(id, event.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}