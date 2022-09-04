package com.vasvince.massageminutecounter.Model;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Massage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int remainingMinutes;
    @ManyToOne
    private User user;
    private String action;
    private int minutes;
    private LocalDateTime timeStamp;

    public Massage() {}

    public Massage(int remainingMinutes, User user, String action, int minutes, LocalDateTime timeStamp) {
        this.remainingMinutes = remainingMinutes;
        this.user = user;
        this.action = action;
        this.minutes = minutes;
        this.timeStamp = timeStamp;
    }
    public Massage(int remainingMinutes, String action, int minutes, LocalDateTime timeStamp) {
        this.remainingMinutes = remainingMinutes;
        this.action = action;
        this.minutes = minutes;
        this.timeStamp = timeStamp;
    }

    public int getRemainingMinutes() {
        return remainingMinutes;
    }

    public void setRemainingMinutes(int remainingMinutes) {
        this.remainingMinutes = remainingMinutes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "Massage{" +
                "id=" + id +
                ", remainingMinutes=" + remainingMinutes +
                ", user=" + user +
                ", action=" + action +
                ", minutes=" + minutes +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
