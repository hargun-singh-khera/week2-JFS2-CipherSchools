package LinkedListHashsetHashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    /*Write a Java Program that ask user to enter 5 subject marks
     * Prepare a map where the key: Marks, value=Pass if marks>45 else Fail
     * {54=Pass,33=Fail....}*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> map = new HashMap<>();
        System.out.println("Enter 5 subject marks");
        String result=null;
        for (int i=0;i<5;i++) {
             int marks = sc.nextInt();
             if (marks > 45) {
                 result="Pass";
             }
             else {
                 result="Fail";
             }
             map.put(marks,result);
        }

        System.out.println(map);
    }
}
