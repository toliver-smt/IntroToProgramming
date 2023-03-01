package com.oliver.lesson1;

/****************************************************************************
 * <b>Title</b>ExerciseOneBonus.java<p/>
 * <b>Description: Creates and assigns different values to
 * different java types, then prints them to the console</b> 
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2023<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Tyler Oliver
 * @version 11.0.17
 * @since Feb 15, 2023
 * <b>Changes: </b>
 ****************************************************************************/

// create class
public class Types {

    // member variables
    private int myInteger;
    private double myDouble;
    private float myFloat;
    private char myChar;
    private boolean myBoolean;

    /**
     * main method that calls other methods
     * @param args
     */
    public static void main(String[] args) {
        // create an instance of the Types class
        Types obj = new Types();

        // initialize instance variables
        obj.myInteger = 5;
        obj.myDouble = 37.266D;
        obj.myFloat = 52.67F;
        obj.myChar = 't';
        obj.myBoolean = true;

        // call printVals() for myObj
        obj.printVals();
    }

    /**
     * Prints the values to the console.
     */
    void printVals() {
        // print information for a specific instance to the console
        System.out.println("myInteger = " + myInteger);
        System.out.println("myDouble = " + myDouble);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myChar = " + myChar);
        System.out.println("myBoolean = " + myBoolean);
    }
}
