package com.oliver.lesson4;
import java.io.*;

public class Object2 {
    
    public static void main(String[] args) throws IOException{
        Object1 x = new Object1("/home/tyler/eclipse-workspace/IntroToProgramming/src/main/java/com/oliver/lesson4/fileOne.txt");
        x.readFile();
    }

}