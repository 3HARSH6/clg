import Student.*;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insert(new Student(1, "Alice"));
        dll.insert(new Student(2, "Bob"));
        dll.insert(new Student(3, "Charlie"));

        dll.display(); // Output: Doubly Linked List: Student [id=1, name=Alice] Student [id=2,
                       // name=Bob] Student [id=3, name=Charlie]
    }
}
