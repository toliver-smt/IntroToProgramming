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
	
	//member variable
    private String myFileName;
    
    /**
     * create a constructor that accepts a file name and initializes 'myFileName'
     * @param fileName
     */
    public Object1(String fileName) {
        myFileName = fileName;
    }
    
    /**
     * reads a text file and return's a string of its content
     * @return
     * @throws IOException
     */
    public String readFile() throws IOException {
    	File inputFile = new File(myFileName);
        FileReader reader = new FileReader(inputFile);
        String fileText = "";
        int c;
        while((c = reader.read()) != -1) {
            fileText += ((char)c);
        }
        reader.close();
        return fileText;
    }
    
    /**
     * Converts a String to upper case and writes it to a new file
     * @param fileText
     * @throws IOException
     */
    public void writeUpperCaseFile(String fileText) throws IOException {
        fileText = fileText.toUpperCase();
    	File outputFile = new File("src/main/java/com/oliver/lesson4/resources/test.txt");
    	FileWriter writer = new FileWriter(outputFile);
    	writer.write(fileText);
    	writer.close();
    }

}
