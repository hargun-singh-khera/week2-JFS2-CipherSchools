package ReadingFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("F:\\datasets.csv");
        BufferedReader br = new BufferedReader(fr);
        String line;
        ArrayList<String> pokemons = new ArrayList<>();

        while((line=br.readLine())!=null) {
//            System.out.println(line);
            pokemons.add(line);
        }

        Scanner sc = new Scanner(System.in);
        String type=sc.next();
        HashSet ptypes = new LinkedHashSet();

        if (!ptypes.contains(type)) {
            System.out.println("Invalid Pokemon Type");
            return;
        }

        for (String pok: pokemons) {
            String ptype = pok.split(",")[1];
            if (ptype.equals(type)) {
                System.out.println(pok);
            }
        }
    }
}
