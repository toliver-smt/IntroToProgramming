package com.oliver.lesson4;
import java.io.*;

/****************************************************************************
 * <b>Title</b>Object1.java<p/>
 * <b>Description: Provides methods for reading and writing a file</b> 
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2023<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Tyler Oliver
 * @version 1.0
 * @since Mar 6, 2023
 * <b>Changes: </b>
 ****************************************************************************/

public class Object1 {
	
	//member variables
    private String myFileName;
    private String fileText = "";
    
    /**
     * create a constructor that accepts a file name and initializes 'myFileName'
     * @param fileName
     */
    public Object1(String fileName) {
        myFileName = fileName;
    }
    
    /**
     * reads a file and converts it to upper case, Initializes 'fileText'
     * @throws IOException
     */
    public void readFile() throws IOException {
    	File inputFile = new File(myFileName);
        FileReader reader = new FileReader(inputFile);
        int c;
        while((c = reader.read()) != -1) {
            fileText += ((char)c);
        }
        reader.close();
    }
    
    /**
     * writes the data from 'fileText' to the given file path
     * @throws IOException
     */
    public void writeUpperCaseFile() throws IOException {
        fileText = fileText.toUpperCase();
    	File outputFile = new File("src/main/java/com/oliver/lesson4/resources/test.txt");
    	FileWriter writer = new FileWriter(outputFile);
    	writer.write(fileText);
    	writer.close();
    }

}
