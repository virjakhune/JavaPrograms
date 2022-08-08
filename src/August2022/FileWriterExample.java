package August2022;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Program Of File Writer
 * 04-08-2022
 * Author:Virja khune
 */

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw= new FileWriter("abc.txt",true);
        fw.write(100);
        fw.write("Computer\nSoftwareEngineer");
        fw.write('\n');
        char[]ch= {'a','b','c'};
        fw.write(ch);
        fw.write('\n');
        fw.flush();
        fw.close();

    }
}
