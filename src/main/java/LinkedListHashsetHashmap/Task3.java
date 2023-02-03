package LinkedListHashsetHashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Task3 {
    /*Write a function called showNumbers that takes a parameter called limit.
     *Should produce a map of all the numbers between 0 and limit with a label to
     * identify the even and odd numbers. For example, if the limit is 3, it should
     * produce a map as follows:
     *   0 EVEN
     *   1 ODD
     *   2 EVEN
     *   3 ODD */
    public void showNumbers(int limit) {
        HashMap<Integer,String> map = new HashMap<>();
        String ans = null;
        for (int i=0;i<=limit;i++) {
            if (i%2==0) {
                ans="EVEN";
            }
            else {
                ans="ODD";
            }
            map.put(i,ans);
        }

        System.out.println(map);
    }
    public static void main(String[] args) {
        Task3 obj = new Task3();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        System.out.println();
        obj.showNumbers(limit);
    }
}
