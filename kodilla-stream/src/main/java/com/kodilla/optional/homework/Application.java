package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Student1", new Teacher("John Smiths")));
        students.add(new Student("Student2", new Teacher("John Smiths")));
        students.add(new Student("Student3", new Teacher("John Smiths")));
        students.add(new Student("Student4", null));
        students.add(new Student("Student5", null));
        students.add(new Student("Student6", null));
        students.add(new Student("Student7", new Teacher("Alice White")));
        students.add(new Student("Student8", new Teacher("JAlice White")));
        students.add(new Student("Student9", new Teacher("Alice White")));
        students.add(new Student("Student10", null));
        students.add(new Student("Student11", null));
        students.add(new Student("Student12", null));

        for(Student student : students) {
            System.out.println("Student: " + student.getStudentName() + ", Teacher:" + student.getTeacher().getTeacherName());
        }
    }
}
