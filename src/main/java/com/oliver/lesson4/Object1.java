package com.oliver.lesson4;
import java.io.*;

public class Object1 {

    private String myFileName;

    public Object1(String fileName) {
        myFileName = fileName;
    }

    public void readFile() throws IOException {
        FileReader reader = new FileReader(myFileName);
        int data = reader.read();
        while(data != -1) {
            System.out.print((char)data);
            data = reader.read();
        }
        reader.close();
    }

}
