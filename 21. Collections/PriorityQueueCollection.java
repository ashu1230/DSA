import java.util.PriorityQueue;

public class PriorityQueueCollection {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        pq.add(54);
        pq.add(64);
        pq.add(3);
        pq.add(74);
        pq.add(4);
        pq.add(84);

        System.out.println(pq.peek());

        pq.forEach((x) -> System.out.println(x));

        pq.poll();
        System.out.println("After Deletion");
        pq.forEach((x) -> System.out.println(x));
    }
}
