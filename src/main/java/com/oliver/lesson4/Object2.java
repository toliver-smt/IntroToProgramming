package com.oliver.lesson4;
import java.io.*;

/****************************************************************************
 * <b>Title</b>Object2.java<p/>
 * <b>Description: Instantiate Object 1 and read/write a file</b> 
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
    public static void main(String[] args) throws IOException {
        Object1 x = new Object1("src/main/java/com/oliver/lesson4/resources/fileOne.txt");
        x.readFile();
        x.writeUpperCaseFile();
    }
}