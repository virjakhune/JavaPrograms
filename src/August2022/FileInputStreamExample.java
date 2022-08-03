package August2022;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Program Of File Input Stream
 * 01-08-2022
 * Author:Virja khune
 */

public class FileInputStreamExample {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\IdeaProjects\\OfficePrograms\\src\\August2022\\abc.txt");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.println("data: " + data + "\t" + (char) data);
            }

            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

/**
 * OUTPUT
 * data: 72	H
 * data: 101	e
 * data: 108	l
 * data: 108	l
 * data: 111	o
 * data: 32
 * data: 86	V
 * data: 105	i
 * data: 114	r
 * data: 106	j
 * data: 97	a
 * data: 32
 * data: 75	K
 * data: 104	h
 * data: 117	u
 * data: 110	n
 * data: 101	e
 * data: 13
 * data: 10
 */
