package com.kodilla.collections.adv.immutable.homework;

public class TaskApplication {

    public static void main(String[] args) {

        Task task = new TaskHacked("Walk", 30);
        TaskHacked taskhacked = (TaskHacked) task;
        taskhacked.modifyTitle("Run");
        taskhacked.modifyDuration(45);


        System.out.println(task.getTitle());
        System.out.println(task.getDuration());

    }

}
