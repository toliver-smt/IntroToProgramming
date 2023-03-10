import java.io.*;

public class Object1{

    private String myFileName;

    public Object1(String fileName) {
        myFileName = fileName;
    }

    public FileReader readFile() {
        File inputFile = new File(myFileName);
        FileReader in = new FileReader(inputFile);
        return in;
    }

    public FileWriter writeFile() throws IOException{
        File outputFile = new File("myFile.txt");
        FileWriter out = new FileWriter(outputFile);
        return out;
    }
}