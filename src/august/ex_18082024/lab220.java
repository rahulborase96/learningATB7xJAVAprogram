package august.ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class lab220 {
    public static void main(String[] args) throws FileNotFoundException {
        readFile();

    }

    private static void readFile() throws FileNotFoundException {
        System.out.println("Hello World");
        String path = "/Users/RAHUL/Downloads/Core.Java.pdf";
        File file =  new File(path);
        FileReader fileReader =new FileReader(file);
        // read the file txt it can read the file
        System.out.println("End of the program");
    }
}
