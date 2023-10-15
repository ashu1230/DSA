package DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(9);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertLast(88);

        list.insert(3, 67);

        list.display(); 
    }
}
