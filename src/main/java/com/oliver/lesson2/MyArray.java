package com.oliver.lesson2;

/****************************************************************************
 * <b>Title</b>ExerciseThree.java<p/>
 * <b>Description: creates a 10 integer array and populates
 * it with random integers, then prints the index and value to the console</b> 
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2023<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Tyler Oliver
 * @version 11.0.17
 * @since Feb 16, 2023
 * <b>Changes: </b>
 ****************************************************************************/

// create class
public class MyArray {

    // member variables
    private int[] myArr;
    
    /**
     * main method that calls other methods
     * @param args
     */
    public static void main(String[] args) {
        // create an instance of the MyArray class
        MyArray newArray = new MyArray();
        // initialize myArr to have 10 elements
        newArray.myArr = new int[10];
        // call printArr method
        newArray.printArr(newArray.myArr);
    }

    /**
     * populate the array with random values
     * @param int[] arr
     */
    void printArr(int[] arr) {
        // loop through each element of the array
        for(int i = 0; i<arr.length; i++) {
            // assign a random integer from 1-100 to each element
            arr[i] = (int)(Math.random() * 100);
            // print the index and value to the console
            System.out.println("index " + i + " : " + arr[i] + " ");
        }
    }
}
