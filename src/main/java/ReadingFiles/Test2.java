package ReadingFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("F:\\datasets.csv");
        BufferedReader br = new BufferedReader(fr);
        String line;

        ArrayList<String> pokemons = new ArrayList<>();
        br.readLine();
        while((line=br.readLine())!=null) {
//            System.out.println(line);
            pokemons.add(line);
        }
        System.out.println("Total Pokemons "+pokemons.size());

        ArrayList<String> pokemonTitles = new ArrayList<>();
        for (String pok: pokemons) {
            String title = pok.split(",")[0];
            pokemonTitles.add(title);
        }
        System.out.println(pokemonTitles);

        br.close();
        fr.close();
    }
}
