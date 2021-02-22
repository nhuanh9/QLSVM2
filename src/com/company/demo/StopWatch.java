package com.company.demo;

public class StopWatch {
    private long startTime;
    private long endTime;
    public static int time = 0;

    public StopWatch() {
    }

    public static void inra() {
        System.out.println(time);
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.start();
        sw.end();
        System.out.println(sw.getElapsedTime());
    }
}
