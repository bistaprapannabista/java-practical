// Program to write hello world in abc.txt file.

import java.io.FileWriter;
import java.io.IOException;

public class Lab3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("abc.txt");
        fw.write("Hello World");
        System.out.println("Successfully written");
        fw.close();
    }

}
