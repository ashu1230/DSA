import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(20);

        ArrayList<Integer> list2 = new ArrayList<>(List.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));

        list1.add(10);
        list1.add(0, 7);
        System.out.println(list1);
        list1.addAll(list2);
        list1.addAll(3, list2);
        System.out.println(list1.contains(550));
        System.out.println("List is clear-> " + list1.isEmpty());
        System.out.println("size of list-"+list1.size());
        System.out.println("size of list-"+list1.hashCode()); 
        System.out.println("size of list-"+list1.getClass());  
        System.out.println("size of list-"+list1.spliterator());
        System.out.println("size of list-"+list1.lastIndexOf(10));

        for (Integer xInteger : list2) {
            System.out.println(xInteger);
        }

        // list1.clear();
        System.out.println(list1);
    }
}
