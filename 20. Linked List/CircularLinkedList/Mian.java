package CircularLinkedList;

public class Mian {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(3);
        list.insert(9);
        list.insert(4);
        list.insert(3);
        list.insert(6);
        list.insert(8);

        list.display();
        list.delete(4);

        list.display();
    }
}
