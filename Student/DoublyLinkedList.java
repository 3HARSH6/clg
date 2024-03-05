package Student;



class DoublyLinkedList {
    Node head, tail;

    public void insert(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void display() {
        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.student + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
