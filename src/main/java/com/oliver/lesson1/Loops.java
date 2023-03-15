package com.oliver.lesson1;

/****************************************************************************
 * <b>Title</b>ExerciseTwo.java<p/>
 * <b>Description: creates multiple different loops and then
 * outputs their values to the console </b> 
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2023<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Tyler Oliver
 * @version 1.0
 * @since Feb 15, 2023
 * <b>Changes: </b>
 ****************************************************************************/

// create class
public class Loops {

    /**
     * main method that calls other methods
     * @param args
     */
    public static void main(String[] args) {
        Loops obj = new Loops();
        obj.process();
    }

    
    public void process() {
    	myWhile();
    	myFor();
    	onlyEven();
    }
    /**
     * a while loop that prints values from 1-10
     */
    public void myWhile() {
        int x = 1;
        System.out.print("myWhile() loop output: ");
        while(x<11) {
            System.out.print(x + " ");
            x++;
        }
        System.out.print('\n');
    }

    /**
     * a for loop that prints values from 10-1
     */
    public void myFor() {
        System.out.print("myFor() loop output: ");
        for(int x = 10; x>0; x--) {
            System.out.print(x + " ");
        }
        System.out.print('\n');
    }

    /**
     * a while loop that prints even values from 1-20
     */
    public void onlyEven() {
        int x = 2;
        System.out.print("onlyEven() output: ");
        while(x<21) {
            System.out.print(x + " ");
            x = x + 2;
        }
        System.out.print('\n');
    }
}
