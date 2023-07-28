package sharing;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

    public static void main(String[] args) {
        // Specific type for ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Non-specific type for Array List
        ArrayList arrayList1 = new ArrayList<>();


        // Add single value
        arrayList.add("Add");
        arrayList.add("Value");
        System.out.println(arrayList);


        // Add multiple values from Collections fw
        Collections.addAll(arrayList, "This", "way", "to", "add", "multiple", "items", "to", "ArrayList");
        Collections.addAll(arrayList1, "Numberic", 1, 'c', 5.24, -845);



        // Add multiple value from collection
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);

        arrayList1.addAll(arrayList);
        System.out.println(arrayList1);


        // Update item
        arrayList.set(1, "ABC");
        System.out.println(arrayList);



        // Removing item
        arrayList.remove(3);
        System.out.println(arrayList);



        // Get value of index
        String a = arrayList.get(1);



        // Sort
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);



        // Length (size)
        System.out.println("arrayList size: " + arrayList.size());

    }

}
