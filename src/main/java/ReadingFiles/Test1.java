package ReadingFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test1 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("F:\\TestFile.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;

//        till the time value of line variable is not matching with null keep
//        running the loop

        while((line=br.readLine())!=null) {
            System.out.println(line);
        }

        br.close();
        fr.close();
    }
}
