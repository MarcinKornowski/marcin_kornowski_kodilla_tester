package com.kodilla.collections.adv.maps.complex.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String schoolName;
    private List<Integer>  studentsInInSchool = new ArrayList<>();

    public School(String schoolName ,int ...studentsInInSchool) {
        this.schoolName = schoolName;
        for(int studentsInClass: studentsInInSchool) {
            this.studentsInInSchool.add(studentsInClass);
        }
    }

    public double getAverageStudentsInSchool() {
        double sumStudents = 0.0;
        for(double studentsInClass: studentsInInSchool) {
            sumStudents += studentsInClass;
        }
        return sumStudents / studentsInInSchool.size();
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "Students in each class" + studentsInInSchool;

    }
}
