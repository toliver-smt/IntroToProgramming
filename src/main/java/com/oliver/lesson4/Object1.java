package com.oliver.lesson4;
import java.io.*;

/****************************************************************************
 * <b>Title</b>Object1.java<p/>
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

public class Object1 {
	
	//create an instance variable that will hold the file name
    private String myFileName;
    
    /**
     * create a constructor that accepts a file name and initializes 'myFileName'
     * @param fileName
     */
    public Object1(String fileName) {
        myFileName = fileName;
    }
    
    /**
     * reads a file and converts it to upper case
     * @return a string that represents the file that was read
     * @throws IOException
     */
    public String readFile() throws IOException {
        FileReader reader = new FileReader(myFileName);
        int data = reader.read();
        String fileText = "";
        while(data != -1) {
            fileText += ((char)data);
            data = reader.read();
        }
        fileText = fileText.toUpperCase();
        reader.close();
        return fileText;
    }
    
    /**
     * writes the file to the given file path
     * @throws IOException
     */
    public void writeFile(String readFile) throws IOException {
    	FileWriter writer = new FileWriter("/home/tyler/eclipse-workspace/IntroToProgramming/src/main/java/com/oliver/lesson4/test.txt");
    	writer.write(readFile);
    	writer.close();
    }

}
