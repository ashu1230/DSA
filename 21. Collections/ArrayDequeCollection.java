import java.util.ArrayDeque;

public class ArrayDequeCollection {
    public static void main(String[] args) {

        ArrayDeque<Integer> DQ = new ArrayDeque<>();

        // DQ.offerFirst(90);
        // DQ.offerFirst(10);
        // DQ.offerFirst(20);
        // DQ.offerFirst(30);
        // DQ.offerFirst(40);
        // DQ.addFirst(65);        // Meaning is both are same.
        // DQ.forEach((x) -> System.out.println(x));

        // this is stack
        DQ.offerLast(90);
        DQ.offerLast(10);
        DQ.offerLast(20);
        DQ.offerLast(30);
        DQ.offerLast(40);
        
        System.out.println(DQ);
        DQ.pollFirst();
        
        DQ.forEach((x) -> System.out.println(x));

        System.out.println(DQ);
        DQ.clear();

        DQ.offerFirst(90);
        DQ.offerFirst(10);
        DQ.offerFirst(20);
        DQ.offerFirst(30);
        DQ.offerFirst(40);
        
        System.out.println(DQ);
        DQ.pollLast();
        
        DQ.forEach((x) -> System.out.println(x));

        System.out.println(DQ);
    }
}
