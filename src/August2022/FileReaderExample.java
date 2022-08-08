package August2022;

import java.io.FileReader;
import java.io.IOException;

/**
 *Program Of File Reader
 * 03-08-2022
 * Author:Virja khune
 */

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fr= new FileReader("abc.txt");
        int i= fr.read();
        while(i!= -1) {
            System.out.println((char)i);

            i=fr.read();
        }
        fr.close();

    }
}

/**
 * OUTPUT
 * p
 * u
 * n
 * e
 */
