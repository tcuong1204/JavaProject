package sharing;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableEx {

    public static void main(String[] args) {

        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("name", "Audi");
        hashtable.put("color", "Red");

        System.out.println("Printing each <Key, Value> pairs using Iterator");
        Iterator<String> iterator = hashtable.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = hashtable.get(key);
            System.out.println(key + ": " + value);
        }

    }

}
