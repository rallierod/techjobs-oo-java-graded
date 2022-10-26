package org.launchcode.techjobs.oo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String oops = "OOPS! This job does not seem to exist.";
        String noData = "Data not available";
        String theName;
        String theEmployer;
        String theLocation;
        String thePosition;
        String theCompetency;
        int start = 0;
        String empty = "";
        if(name == null) {
            theName = noData;
            start++;
        }else {
            theName = name;
        }
        if(employer == null || employer.getValue() == empty) {
            theEmployer = noData;
            start++;
        } else {
            theEmployer = employer.getValue();
        }
        if(location == null || location.getValue() ==empty) {
            theLocation =noData;
            start++;
        } else {
            theLocation = location.getValue();
        }
        if(positionType == null || positionType.getValue() == empty) {
            thePosition = noData;
            start++;
        } else {
            thePosition = positionType.getValue();
        }
        if(coreCompetency == null || coreCompetency.getValue() == empty) {
            theCompetency = noData;
            start++;
        } else {
            theCompetency = coreCompetency.getValue();
        }

        String toStringVar = ("\n" +
                "ID: " + getId() +
                "\nName: " + getName() +
                "\nEmployer: " + theEmployer +
                "\nLocation: " + theLocation +
                "\nPosition Type: " + thePosition +
                "\nCore Competency: " + theCompetency +
                "\n");
        if (empty.equals("")){
            return toStringVar;
        } else {
            return oops;
        }






    }
}




