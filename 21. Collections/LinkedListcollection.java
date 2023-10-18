import java.util.LinkedList;
import java.util.List;

public class LinkedListcollection {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();

        LinkedList<Integer> list2 = new LinkedList<>(List.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));

        list1.add(10);
        list1.add(0, 7);
        System.out.println(list1);
        list1.addAll(list2);
        list1.addAll(3, list2);
        System.out.println(list1.contains(550));
        System.out.println("List is clear-> " + list1.isEmpty());
        System.out.println("size of list 1 -"+list1.size());
        System.out.println("size of list 2 -"+list1.hashCode()); 
        System.out.println("size of list 3 -"+list1.getClass());  
        System.out.println("size of list 4 -"+list1.spliterator());
        System.out.println("size of list 5 -"+list1.lastIndexOf(10));

        for (Integer x : list2) {
            System.out.println(x);
        }

        list2.addFirst(97);
        list2.addLast(97);
        System.out.println("First And Last Ele Inserted "+list2);
        list2.removeFirst();
        list2.removeLast();
        System.out.println("First And Last Ele Removed "+list2);
        System.out.println(list2);
        list2.getFirst();
        System.out.println(list2);
        // list1.clear();
        System.out.println(list1);
    }
}
