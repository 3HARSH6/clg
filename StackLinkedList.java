public class StackLinkedList {
    Node head;
    Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int val = top.data;
        top = top.next;
        return val;
    }
}
