package com.oliver.lesson4;
import java.io.*;

/****************************************************************************
 * <b>Title</b>Object2.java<p/>
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

public class Object2 {
    /**
     * Instantiate Object 1 and call its methods
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{
        Object1 x = new Object1("/home/tyler/eclipse-workspace/IntroToProgramming/src/main/java/com/oliver/lesson4/fileOne.txt");
        x.writeFile(x.readFile());
    }
}