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
        thisMap.go(thisMap);
    }

    /**
     * control method that calls other methods
     * @param thisInstance: the current instance of MyMap
     */
    public void go(MyMap thisInstance) {
        // generate the map
        Map<String, String> thisStatesMap = thisInstance.generateMap();
        // sort the map in ascending order and print
        Map<String, String> thisAscendingMap = thisInstance.ascendingOrder(thisStatesMap);
        thisInstance.printMap(thisAscendingMap);
        // sort the map in descending order and print
        Map<String, String> thisDescendingMap = thisInstance.descendingOrder(thisStatesMap);
        thisInstance.printMap(thisDescendingMap);
    }

    /**
     * create a map of states
     * @return a map of states
     */
    public Map<String, String> generateMap() {
        //Create an object of state/abbreviation
        String[][] myStates = {{"Alabama", "AL"}, {"Alaska", "AK"}, {"Arizona", "AZ"}, {"Arkansas", "AR"}, {"California", "CA"}, {"Colorado", "CO"}, {"Connecticut", "CN"}, {"Delaware", "DE"}, {"Florida", "FL"}, {"Georgia", "GA"},
            {"Hawaii", "HI"}, {"Idaho", "ID"}, {"Illinois", "IL"}, {"Indiana", "IN"}, {"Iowa", "IA"}, {"Kansas", "KS"}, {"Kentucky", "KY"}, {"Louisiana", "LA"}, {"Maine", "ME"}, {"Maryland", "MD"}, {"Massachusetts", "MA"}, {"Michigan", "MI"},
            {"Minnesota", "MN"}, {"Mississippi", "MS"}, {"Missouri", "MO"}, {"Montana", "MT"}, {"Nebraska", "NE"}, {"Nevada", "NV"}, {"New Hampshire", "NH"}, {"New Jersey", "NJ"}, {"New Mexico", "NM"}, {"New York", "NY"}, {"North Carolina", "NC"},
            {"North Dakota", "ND"}, {"Ohio", "OH"}, {"Oklahoma", "OK"}, {"Oregon", "OR"}, {"Pennsylvania", "PA"}, {"Rhode Island", "RI"}, {"South Carolina", "SC"} ,{"South Dakota", "SD"}, {"Tennessee", "TN"}, {"Texas", "TX"}, {"Utah", "UT"}, 
            {"Vermont", "VT"}, {"Virginia", "VA"}, {"Washington", "WA"}, {"West Virginia", "WV"}, {"Wisconsin", "WI"}, {"Wyoming", "WY"}
        };
        //Create a map using 'myStates'
        Map<String, String> statesMap = new HashMap<String, String>();
            for (int i=0; i<myStates.length; i++) {
                statesMap.put(myStates[i][0], myStates[i][1]);
            }
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
        System.out.println(map);
    }
}
