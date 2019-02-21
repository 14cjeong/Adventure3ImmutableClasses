package com.company;

//GOAL is to teach about IMMUTABLE CLASSES

import java.util.HashMap;
import java.util.Map;

public class Location {
    //use of final serves two advantages
    //lets external developers know that they shouldn't change this.
    //(also lets them know that we didn't forget a setter)

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>(exits);
        this.exits.put("Q", 0);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }


    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}

//For more on immutable classes from Oracle

//https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html

