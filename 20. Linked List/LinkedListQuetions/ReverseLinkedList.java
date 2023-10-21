package LinkedListQuetions;

public class ReverseLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public ReverseLinkedList() {
        this.size = 0;
    }
    public static void main(String[] args) {
        

    }

    //  by recursion ...
    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }

        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // In place reversal of linked list...
    public void reverse() {
        if(size < 2){
            return;
        }
        if(head == null) {
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null ){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        head = prev;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
