package CollectionFramework;

import java.util.Iterator;
import java.util.Vector;

public class Test2 {
    public static void main(String[] args) {
        Vector vec = new Vector();
        vec.add("Texas");
        vec.add("Zurich");
        vec.add("NewYork");

        Iterator it = vec.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
