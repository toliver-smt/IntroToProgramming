import java.io.*;

public class Object2 {
    
    public static void main(String[] args) throws IOException{
        Object2 x = new Object2();
        x.go();
    }

    public void go() throws IOException{
        Object1 x = new Object1("fileOne.txt");
        FileReader in = x.readFile();
        FileWriter out = x.writeFile();
        myUpperCase(in, out);
    }
    //read the info frim File
    //convert to upper case
    //write out a new file
    public void myUpperCase(FileReader readFile, FileWriter writeFile) throws IOException{
        int c;
        while((c = readFile.read()) != -1) {
            writeFile.write(c);
        }
        readFile.close();
        writeFile.close();
    }
}
