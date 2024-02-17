
public class LL {

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void display() {

        if (head == null) {
            System.out.println("list is empty.");
        }
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + "---> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        head = head.next;
    }

    public void deleteLast() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node lastNode = head.next;
        Node secondNode = head;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondNode = secondNode.next;
        }

        secondNode.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst("harsh");
        list.addFirst("skhfs");
        list.addFirst("aigs");
        list.addLast("hello");

        list.display();
        list.deleteLast();
        list.display();
        list.deleteFirst();
        list.display();
    }
}
