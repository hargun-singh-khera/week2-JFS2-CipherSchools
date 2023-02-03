package LinkedListHashsetHashmap;

import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("Ironman");
        ll.add("Thor");
        ll.add("Hulk");
        ll.add("Loki");

        System.out.println(ll.get(1));

        ll.addLast("Gamora");
        ll.addFirst("Antman");
        ll.add(2,"Natasha");

        Iterator it = ll.iterator();
        while(it.hasNext()) {
//            it.remove();
            System.out.println(it.next());
        }

        System.out.println("----------------------");
        System.out.println("Who's at the top "+ll.peek());
        System.out.println("Hey first one get out "+ll.peek());

        System.out.println("Who's their standing at the last! "+ll.pop());
        System.out.println("-----------------------");

        it=ll.iterator();
        while(it.hasNext()) {
//            it.remove();
            System.out.println(it.next());
        }
    }
}
