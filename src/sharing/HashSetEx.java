package sharing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("C++");
        hashSet.add("Java");
        hashSet.add("Python");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().hashCode());
        }


        System.out.println();

        // Add ArrayList to compare the difference
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C");
        arrayList.add("C");

        Iterator<String> iterator1 = arrayList.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }


    }

}
