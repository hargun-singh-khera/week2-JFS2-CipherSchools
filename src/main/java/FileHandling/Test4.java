package FileHandling;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
//        listing files.
        File f = new File("F:\\datasets");
        String[] files = f.list();

        for (String file: files) {
            System.out.println(file);
        }
        File[] files_arr = f.listFiles();
        for (File ff:files_arr) {
            ff.delete();
        }
    }
}
