package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    private String name;
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getStudentName() {
        return name;
    }

    public Teacher getTeacher() {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher);
        Teacher teacherName = optionalTeacher.orElse(new Teacher("<undefined>"));
        return teacherName;
    }

}
