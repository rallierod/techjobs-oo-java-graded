package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField{

//    private int id;
//    private static int nextId = 1;
//    private String value;

    public CoreCompetency() {
        this.id = nextId;
        nextId++;
    }

    public CoreCompetency(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:


}
