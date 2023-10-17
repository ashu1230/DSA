public class Main {
    public static void main(String[] args) {
        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(34);

        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(9);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertLast(99);
        list.insert(100, 5);

        list.insertRec(90, 6);
        list.display();
        
        list.display();
        list.deleteFirst();
        
        list.display();
        list.deleteLast();

        list.deleteIndex(2);

        // list.find(3);

        list.display();
    }
}
