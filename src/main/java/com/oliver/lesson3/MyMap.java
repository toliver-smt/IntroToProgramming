package com.oliver.lesson3;

/****************************************************************************
 * <b>Title</b>MyMap.java<p/>
 * <b>Description: create a map and display its values in ascending
 * and descending order </b> 
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2023<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Tyler Oliver
 * @version 1.0
 * @since Mar 6, 2023
 * <b>Changes: </b>
 ****************************************************************************/

import java.util.*;

public class MyMap {

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        MyMap thisMap = new MyMap();
        thisMap.process();
    }

    /**
     * control method that calls other methods
     * @param x: the current instance of MyMap
     */
    public void process() {
        // generate the map
        Map<String, String> thisStatesMap = generateMap();
        // sort the map in ascending order and print
        printMap(ascendingOrder(thisStatesMap));
        // sort the map in descending order and print
        printMap(descendingOrder(thisStatesMap));
    }

    /**
     * create a map of states
     * @return a map of states
     */
    public Map<String, String> generateMap() {
        //Create a map
        Map<String, String> statesMap = new HashMap<String, String>();
        statesMap.put("Alabama", "AL");
        statesMap.put("Alaska", "AK");
        statesMap.put("Arizona", "AZ");
        statesMap.put("Arkansas", "AR");
        statesMap.put("California", "CA");
        statesMap.put("Colorado", "CO");
        statesMap.put("Connecticut", "CN");
        statesMap.put("Delaware", "DE");
        statesMap.put("Florida", "FL");
        statesMap.put("Georgia", "GA");
        statesMap.put("Hawaii", "HI");
        statesMap.put("Idaho", "ID");
        statesMap.put("Illinois", "IL");
        statesMap.put("Indiana", "IN");
        statesMap.put("Iowa", "IA");
        statesMap.put("Kansas", "KS");
        statesMap.put("Kentucky", "KY");
        statesMap.put("Louisiana", "LA");
        statesMap.put("Maine", "ME");
        statesMap.put("Maryland", "MD");
        statesMap.put("Massachusetts", "MA");
        statesMap.put("Michigan", "MI");
        statesMap.put("Minnesota", "MN");
        statesMap.put("Mississippi", "MS");
        statesMap.put("Missouri", "MO");
        statesMap.put("Montana", "MT");
        statesMap.put("Nebraska", "NE");
        statesMap.put("Nevada", "NV");
        statesMap.put("New Hampshire", "NH");
        statesMap.put("New Jersey", "NJ");
        statesMap.put("New Mexico", "NM");
        statesMap.put("New York", "NY");
        statesMap.put("North Carolina", "NC");
        statesMap.put("North Dakota", "ND");
        statesMap.put("Ohio", "OH");
        statesMap.put("Oklahoma", "OK");
        statesMap.put("Oregon", "OR");
        statesMap.put("Pennsylvania", "PA");
        statesMap.put("Rhode Island", "RI");
        statesMap.put("South Carolina", "SC");
        statesMap.put("South Dakota", "SD");
        statesMap.put("Tennessee", "TN");
        statesMap.put("Texas", "TX");
        statesMap.put("Utah", "UT");
        statesMap.put("Vermont", "VT");
        statesMap.put("Virginia", "VA");
        statesMap.put("Washington", "WA");
        statesMap.put("West Virginia", "WV");
        statesMap.put("Wisconsin", "WI");
        statesMap.put("Wyoming", "WY");
        return statesMap;
    }

    /**
     * sort a map in ascending order
     * @param map: a map of type <String, String>
     * @return a map sorted in ascending order
     */
    public Map<String, String> ascendingOrder(Map<String, String> map) {
        Map<String, String> ascendingMap = new TreeMap<String, String>();
        ascendingMap.putAll(map);
        return ascendingMap;
    }

    /**
     * sort a map in descending order
     * @param map: a map of type <String, String>
     * @return a map sorted in descending order
     */
    public Map<String, String> descendingOrder(Map<String, String> map) {
        Map<String, String> descendingMap = new TreeMap<String, String>(Collections.reverseOrder());
        descendingMap.putAll(map);
        return descendingMap;
    }

    /**
     * print a map to the console
     * @param map: a map of type <String, String>
     */
    public void printMap(Map<String, String> map) {
        System.out.println("~~~~~~~~~~~~~~~~");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
