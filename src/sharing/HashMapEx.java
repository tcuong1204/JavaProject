package sharing;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {

    public static void main(String[] args) {

        // Declare HashMap
        HashMap<String, String> map = new HashMap<>();



        // Put values
        map.put("name", "Audi");
        map.put("logo", "A");
        map.put("weigh", "300");
        map.put("price", "5000");
        System.out.println(map);



        // Get value from key
        System.out.println(map.get("name"));


        // Update item



        // Remove item
        map.remove("weigh");
        System.out.println(map);



        // Read all key value pair
        // For each in Hashmap
        for (String key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }


        // Iterator
        Iterator<String> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(map.get(itr.next()));
        }



    }

}
