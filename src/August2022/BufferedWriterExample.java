package August2022;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Program Of Buffered Writer
 * 08-08-2022
 * Author:Virja khune
 */

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw= new FileWriter("abc.txt");
        BufferedWriter bw= new BufferedWriter(fw);
        bw.write(100);
        bw.newLine();
        char[] ch= {'a','b','c','d'};
        bw.write(ch);
        bw.newLine();
        bw.write("Civil");
        bw.newLine();
        bw.write("Computer");
        bw.flush();
        bw.close();

    }
}
