package com.quang;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    //Constructor
    public Clock(int h, int m, int s) {
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }

    public String getTimeString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public int getHours() { return hours; }
    public int getMinutes() { return minutes; }
    public int getSeconds() { return seconds; }
}
