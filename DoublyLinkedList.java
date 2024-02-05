class Node {
    int data;
    Node next;
    Node pre;

   public Node(int data) {
        this.data = data;
        this.next = null;
        this.pre = null;
    }
}

public class DoublyLinkedList {

    Node head;
    Node tail;

    public void addToEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.pre = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addToFirst(int data) {
        Node newNode = new Node(data);
        
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToEnd(0);
    }
}