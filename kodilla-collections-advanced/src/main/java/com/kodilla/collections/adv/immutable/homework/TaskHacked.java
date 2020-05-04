package com.kodilla.collections.adv.immutable.homework;

public class TaskHacked extends Task {

    private String realTask;
    private int realDuration;

    public TaskHacked(String title, int duration) {
        super(title, duration);
        realTask = title;
        realDuration = duration;
    }

    public void modifyTitle(String newTitle) {
       realTask = newTitle;
    }

    public void modifyDuration(int newDuration) {
        realDuration = newDuration;
    }

    @Override
    public String getTitle() {
        return realTask;
    }

    @Override
    public int getDuration() {
        return realDuration;
    }
}
