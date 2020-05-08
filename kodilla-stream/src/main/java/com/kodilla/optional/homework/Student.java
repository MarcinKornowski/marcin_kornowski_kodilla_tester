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
        if(teacher == null) {
            Teacher teacherNull = new Teacher("<undefined>");
            Optional<Teacher> getTeacherNull = Optional.ofNullable(teacherNull);
            String teacherName = getTeacherNull.orElse(new Teacher("")).getTeacherName();
            return teacherNull;
        } else {
            return teacher;
        }
    }

}
