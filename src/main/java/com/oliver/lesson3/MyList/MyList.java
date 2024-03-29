package com.oliver.lesson3.MyList;

/****************************************************************************
 * <b>Title</b>MyList.java<p/>
 * <b>Description: Create a list of people, then shuffle them into
 * a random order</b> 
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2023<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Tyler Oliver
 * @version 1.0
 * @since Mar 6, 2023
 * <b>Changes: </b>
 ****************************************************************************/

import java.util.*;

public class MyList {

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        MyList thisList = new MyList();
        thisList.process();
    }
    
    /**
     * control method that calls other methods
     * @param x
     */
    public void process() {
    	// generate a list
    	List<Person> thisPersonList = generateList();
    	// print the list
        printList(thisPersonList);
        // shuffle and print a list
        printList(shuffleList(thisPersonList));
    }

    /**
     * generates a list of Person objects
     * @return a List of Person objects
     */
    public List<Person> generateList() {
        // Create multiple people objects
        Person p1 = new Person(1, "Tyler", "Oliver");
        Person p2 = new Person(2, "Hans", "Niemann");
        Person p3 = new Person(3, "Magnus", "Carlson");
        Person p4 = new Person(4, "Bobby", "Fischer");
        Person p5 = new Person(5, "Hikaru", "Nakamura");
        // Create an ArrayList and add the Person objects
        List<Person> data = new ArrayList<>(5);
        data.add(p1);
        data.add(p2);
        data.add(p3);
        data.add(p4);
        data.add(p5);
        return data;
    }

    /**
     * shuffle a list
     * @param personList: a List of Person Objects
     * @return a shuffled List of Person Objects
     */
    public List<Person> shuffleList(List<Person> personList) {
        // Shuffle 'data'
        Collections.shuffle(personList);
        return personList;
    }

    /**
     * prints a List of Person Objects to the console
     * @param personList: a List of Person Objects
     */
    public void printList(List<Person> personList) {
        System.out.println("~~~~~~~~~~~~~");
        for(Person myPerson: personList) {
            System.out.print("Person ID: " + myPerson.getPersonID() + "; ");
            System.out.print("First Name: " + myPerson.getFirstName() + "; ");
            System.out.println("Last Name: " + myPerson.getLastName() + "; ");
        }
    }
}