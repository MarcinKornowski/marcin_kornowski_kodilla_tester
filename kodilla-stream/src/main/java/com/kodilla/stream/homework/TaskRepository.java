package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("task1", LocalDate.of(2020,04,10),LocalDate.of(2020, 05, 03)));
        tasks.add(new Task("task2", LocalDate.of(2020,04,01),LocalDate.of(2020,05,01)));
        tasks.add(new Task("task3", LocalDate.of(2020,04,10),LocalDate.of(2021, 05, 05)));
        tasks.add(new Task("task4", LocalDate.of(2020,04,10),LocalDate.of(2020, 05, 06)));
        tasks.add(new Task("task5", LocalDate.of(2020,04,10),LocalDate.of(2020, 05, 10)));
        tasks.add(new Task("task6", LocalDate.of(2020,04,10),LocalDate.of(2020, 05, 15)));
        tasks.add(new Task("task7", LocalDate.of(2020,04,10),LocalDate.of(2020, 05, 20)));
        tasks.add(new Task("task8", LocalDate.of(2020,04,10),LocalDate.of(2020, 05, 25)));
        return tasks;
    }
}
