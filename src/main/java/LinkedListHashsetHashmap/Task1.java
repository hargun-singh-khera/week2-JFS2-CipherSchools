package LinkedListHashsetHashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Task1 {
    /*Wrtie a JAVA program that ask user to enter 5 English words
    * Prepare a map where the key: word, value=no of characters in word
    * {happy=5,joy=3,....}*/
    public static void main(String[] args) {
        System.out.println("Enter 5 English words");
        HashMap<String,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String s=null;
        for (int i=0;i<5;i++) {
            s= sc.next();
            int length = s.length();
            map.put(s,length);
        }

        System.out.println(map);
    }
}
