package August2022;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * Program Of File Output Stream
 * 02-08-2022
 * Author:Virja khune
 */

public class FileOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos= new FileOutputStream("C:\\Users\\DELL\\IdeaProjects\\OfficePrograms\\src\\August2022\\abc.txt", true);
        String data= "Hello World";
        byte[] b= data.getBytes();
        fos.write(b);
        fos.close();

    }
}
