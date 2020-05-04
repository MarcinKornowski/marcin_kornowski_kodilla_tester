package com.kodilla.collections.adv.maps.complex.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {

        Map<Principal, School> schoolPrincipals = new HashMap<>();

        Principal principalSmiths = new Principal("John", "Smiths");
        Principal principalClay = new Principal("Alex", "Clay");
        Principal principalWood = new Principal("Tom", "Wood");
        Principal principalHoward = new Principal("Tim", "Howard");

        School schoolSmiths = new School( "Goldsmiths School",22, 33, 30, 21);
        School schoolClay = new School("Bexlay School",23, 30, 17, 20);
        School schoolWood = new School("Brixton School",18, 19, 16, 14);
        School schoolHoward = new School("Clapham School",15, 17, 13, 12);

        schoolPrincipals.put(principalSmiths, schoolSmiths);
        schoolPrincipals.put(principalClay, schoolClay);
        schoolPrincipals.put(principalWood, schoolWood);
        schoolPrincipals.put(principalHoward, schoolHoward);

        for(Map.Entry<Principal, School> principalEntry : schoolPrincipals.entrySet()) {
            System.out.println(principalEntry.getKey().getPrincipalName() +
                    " " + principalEntry.getKey().getPrincipalSecondName() +
                    " is the principal of the: " + principalEntry.getValue().getSchoolName() + "." +
                    " Average amount of students in school is: " + principalEntry.getValue().getAverageStudentsInSchool());
        }

    }

}
