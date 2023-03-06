package com.oliver.lesson3.MyList;

/****************************************************************************
 * <b>Title</b>Person.java<p/>
 * <b>Description: Create a Person object</b> 
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2023<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Tyler Oliver
 * @version 1.0
 * @since Mar 6, 2023
 * <b>Changes: </b>
 ****************************************************************************/

public class Person {
    private int personID;
    private String firstName;
    private String lastName;

    /**
     * Set the default constructor
     */
    public Person(){
        personID = 0;
        firstName = "First Name";
        lastName = "Last Name";
    }

    /**
     * set a customized constructor
     * @param thisID
     * @param thisFirstName
     * @param thisLastName
     */
    public Person(int thisID, String thisFirstName, String thisLastName) {
        personID = thisID;
        firstName = thisFirstName;
        lastName = thisLastName;
    }

    /**
     * get personID
     * @return personID
     */
    public int getPersonID() {
        return personID;
    }

    /**
     * get firstName
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * get lastName
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }
}