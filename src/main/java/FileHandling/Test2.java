package FileHandling;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File f = new File("F:\\myfile.txt");
//        using exists() to check if file exists or not
        if (f.exists()) {
            System.out.println("Printing File Details");
            System.out.println("---------------------");
            System.out.println("File Name: "+f.getName());
            System.out.println("File Size: "+f.length());
            System.out.println("File Path: "+f.getAbsolutePath());
            System.out.println("is File Readable ? "+f.canRead());
            System.out.println("is File Writable ?"+f.canWrite());

            System.out.println("--------------------");
        }

//        Creating Directory in Java
        File f1 = new File("F:\\Avengers");
        f1.mkdir();
    }
}
