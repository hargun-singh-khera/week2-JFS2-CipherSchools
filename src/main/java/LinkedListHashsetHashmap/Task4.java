package LinkedListHashsetHashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Task4 {

    /*Write a JAVA program that ask user to enter a sentence
    * Prepare a map where the key: character, value=repetition count of
    * characters. For example: 'crood' {c=1,r=1,o=2,d=1}*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        System.out.print("Enter a sentence: ");
        System.out.println();
        String s = sc.next();
        char value;
        int count=1;
        for (int i=0;i<s.length()-1;i++) {
            value = s.charAt(i);
            if (s.charAt(i) == s.charAt(i+1)) {
                count++;
                continue;
            }
            if (!map.containsKey(s.charAt(i)))
                map.put(value,count);
            count=1;
        }
        map.put(s.charAt(s.length()-1),count);
        System.out.println(map);
    }
}
