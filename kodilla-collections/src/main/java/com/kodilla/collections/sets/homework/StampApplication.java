package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Stamp;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {

    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Ships", "3 x 2", false));
        stamps.add(new Stamp("Planes", "4 x 3", false));
        stamps.add(new Stamp("Animals", "2 x 3", true));
        stamps.add(new Stamp("Castles", "3 x 3", false));
        stamps.add(new Stamp("Gardens", "5 x 3", false));
        stamps.add(new Stamp("Animals", "2 x 3", true));
        stamps.add(new Stamp("Ships", "3 x 2", false));


        System.out.println("Amount of items: " + stamps.size());
        for(Stamp stamp: stamps) {
            System.out.println(stamp);
        }

    }

}
