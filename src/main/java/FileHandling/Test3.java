package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
//        Writing data in file
        FileWriter fw = new FileWriter("F:\\TestFile.txt",true);

//        .write() method to write data in the file.

        fw.write("I am the Earth\n");
        fw.write("I am the Forest Green\n");
        fw.write("I am the Four Winds Blowing\n");
        fw.write("I am the Earth\n");

//        flush() clears the data in the buffer memory and writes into the file.
        fw.flush();
//        close() means closing the connection with file.
        fw.close();

        System.out.println("File Prepared Successfully!");
    }
}
