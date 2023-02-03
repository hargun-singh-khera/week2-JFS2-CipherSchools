package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    /*Write a Java program that ask users to enter a path (directory to be created)
    * Create the directory specified in the path.
    * Create 1000 empty files with the given directory.
    * File name pattern will be 1.txt, 2.txt ....*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the directory path where new files are to be created");
        String path = sc.next();
        System.out.println(path);
        for (int i=0;i<1000;i++) {
            File f = new File(path +"\\" + (i+1) + ".txt");
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("1000 files created successfully in the specified path!");
    }
}
