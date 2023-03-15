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
    
    /**
     * main method that calls other methods
     * @param args
     */
    public static void main(String[] args) {
        // create an instance of the MyArray class
        MyArray newArray = new MyArray();
        // call printArr method
        newArray.printArr();
    }

    /**
     * populate the array with random values
     * @param int[] arr
     */
    void printArr() {
    	//Initialize the array size
    	int[] myArr = new int[10];
        // loop through each element of the array
        for(int i = 0; i<myArr.length; i++) {
            // assign a random integer from 1-100 to each element
            myArr[i] = (int)(Math.random() * 100);
            // print the index and value to the console
            System.out.println("index " + i + " : " + myArr[i] + " ");
        }
    }
}
