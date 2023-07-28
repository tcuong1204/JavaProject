package sharing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {

    public static void main(String[] args) {

        // Declare HashMap
        HashMap<String, String> map = new HashMap<>();


        // Put values
        map.put("name", "Audi");
        map.put("logo", "A");
        map.put("weigh", "300");
        map.put("price", "5000");
        System.out.println("Printing original dictionary");
        System.out.println(map);


        // Get value from key
        System.out.println("\nPrinting value of key=name");
        System.out.println(map.get("name"));


        // Update item
        System.out.println("\nPrinting dictionary after updating item name=Honda");
        map.put("name", "Honda");
        System.out.println(map);


        // Remove item
        System.out.println("\nPrinting dictionary after removing item weigh");
        map.remove("weigh");
        System.out.println(map);


        // Read all key value pair
        // For each in Hashmap
        System.out.println("\nPrinting each <Key, Value> pairs using ForEach");
        for (String key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Iterator
        System.out.println("\nPrinting each <Key, Value> pairs using Iterator");
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }

    }

}
