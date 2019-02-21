package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Map literals are available now
//Unfortunately, the online course uses Java 8, where
//it's not supported
//Here's how to use Map literals
//https://stackoverflow.com/questions/6802483/how-to-directly-initialize-a-hashmap-in-a-literal-way

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));

        tempExit = new HashMap<String, Integer>();
        //Now adding exits for the game
        //Each location has a specific exit (only certain
        // directions are viable)
        //the specific exits are preplanned based on a map
        //prepared by the course
        //LOCATION 1
        //Location.get\(\d\).addExit replaced using ctrl + r
        //Also have to checkmark "regex," which means
        //regular expression.
        //The course still hasn't discussed what that is
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));



        //LOCATION 2
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));


        //LOCATION 3
        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));


        //LOCATION 4
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));


        //LOCATION 5
        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));




        int loc = 1;

        while(true) {

            System.out.println(locations.get(loc).getDescription());
            tempExit.remove("S");
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for(String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            //makes all letters uppercase
            String direction = scanner.nextLine().toUpperCase();

            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }

        }



    }
}

