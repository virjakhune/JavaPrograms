package August2022;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Program Of Buffered Reader
 * 05-08-2022
 * Author:Virja khune
 */

public class BufferedReaderExample {
    public static void main(String[] args) throws Exception{
        FileReader fr= new FileReader("abc.txt");
        BufferedReader br= new BufferedReader(fr);
        String line= br.readLine();
        while (line!= null) {
            System.out.println(line);
            line= br.readLine();
        }
        br.close();

    }
}

/**
 * OUTPUT
 * pune d Computer
 * SoftwareEngineer
 * abc
 */
