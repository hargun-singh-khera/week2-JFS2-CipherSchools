package FileHandling;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        File f = new File("F:\\myfile.txt");

//        for creating file we will call createNewFile() method

        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File created successfully");
    }
}
