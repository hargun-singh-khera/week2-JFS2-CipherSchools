package LinkedListHashsetHashmap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test4 {
    public static void main(String[] args) {
//        Set in JAVA stores only non-duplicate values
//        Hashet has the same property but it doesn't maintain it's order
        HashSet myset = new HashSet();
        myset.add("Green");
        myset.add("Red");
        myset.add("Orange");
        myset.add("Red");
        myset.add("Orange");

        System.out.println(myset);

//        LinkedHashSet has the same property of set, but it maintains its order
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("Green");
        lhs.add("Red");
        lhs.add("Orange");
        lhs.add("Red");
        lhs.add("Orange");

        System.out.println(lhs);

//        TreeSet doesn't allow nulls
//        TreeSet sorts the data in ascending order
        TreeSet ts = new TreeSet();
        ts.add("Cart");
        ts.add("Appple");
        ts.add("Ball");

        System.out.println(ts);
    }
}
