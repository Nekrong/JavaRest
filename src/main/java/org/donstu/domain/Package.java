package org.donstu.domain;

import java.io.Serializable;
import java.util.Date;

public class Package implements Serializable {
    private String title;

    private Date startAt;

    private int duration;

    private String room;

    public Package() {
    }

    public Package(String title, Date startAt, int duration, String room) {
        this.title = title;
        this.startAt = startAt;
        this.duration = duration;
        this.room = room;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
