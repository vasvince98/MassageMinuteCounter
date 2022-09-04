package com.vasvince.massageminutecounter.Model;

public class Minute {
    private int minute;

    public Minute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "Minute{" +
                "minute=" + minute +
                '}';
    }
}
