package com.oliver.lesson3;

/****************************************************************************
 * <b>Title</b>Conversion.java<p/>
 * <b>Description: Create an array of strings, then convert it to
 * a list of strings</b> 
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2023<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Tyler Oliver
 * @version 1.0
 * @since Mar 6, 2023
 * <b>Changes: </b>
 ****************************************************************************/

import java.util.*;

public class Conversion {

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        Conversion thisConversion = new Conversion();
        thisConversion.go(thisConversion);
    }
    
    /**
     * control method that calls other methods
     * @param thisInstance
     */
    public void go(Conversion thisInstance) {
        // create an array of strings
    	String[] thisArray = thisInstance.createArray();
        // convert the array of strings to an List of strings
    	List<String> result = thisInstance.convertArray(thisArray);
        // print the result
        thisInstance.printList(result);
    }

    /**
     * create an array of strings
     * @return an array of strings 'myArray'
     */
    public String[] createArray() {
        String[] myArray = {"one", "two", "three", "four", "five", "six"};
        return myArray;
    }

    /**
     * convert a string array to a list of strings
     * @param an array of strings 'arr'
     * @return a list of strings 'stringList'
     */
    public List<String> convertArray(String[] arr) {
        List<String> stringList = new ArrayList<>(6);
        for (String string: arr) {
            stringList.add(string);
        }
        return stringList;
    }

    /**
     * print a list of strings
     * @param list: a List of strings
     */
    public void printList(List<String> list) {
        System.out.println(list);
    } 
}

