public class Dequeue {
    Integer[] items;
    int front;
    int rear;

    public Dequeue(int size) {
        items = new Integer[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return front == (rear + 1) % items.length;
    }

    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return items[front];
    }

    public Integer valueAtRear() {
        if (isEmpty()) {
            return null;
        }
        return items[rear];
    }
    

    public boolean insertAtFirst(Integer data) {

        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front++;
            rear++;
            items[front] = data;
            return true;
        }

        if (front == 0) {
            front = items.length - 1;
        } else {
            front = front - 1;
        }

        items[front] = data;

        return true;
    }
    

    public void display() {
        if (isEmpty()) {
            return;
        }

        for (int i = front; i != rear; i = (i + 1) % items.length) {
            System.out.print(items[i] + " <---");

        }

        System.out.println(items[rear]);
    }


    public Integer deleteAtFront() {
        if (isEmpty()) {
            return null;
        }

        if (front == rear) {
            Integer val = items[front];
            front = rear = -1;
            return val;
        }

        Integer val = items[front];
        front = (front + 1) % items.length;
        return val;

    }
    

    public Integer deleteAtRear() {
        if (isEmpty()) {
            return null;
        }

        if (front == rear) {
            Integer val = items[rear];
            front = rear = -1;
            return val;
        }

        Integer val = items[rear];

        if (rear == 0) {
            rear = items.length - 1;
        } else {
            rear--;
        }
        return val;
    }

    public boolean addLast(Integer data) {
        if (isFull()) {
            System.out.println("value cant inserted");
            return false;
        }

        if (isEmpty()) {
            front++;
            rear++;
            items[rear] = data;
        } else {
            rear++;
            items[rear] = data;
        }

        return true;

    }


    public static void main(String[] args) {
        Dequeue d = new Dequeue(5);

        d.insertAtFirst(10);
        d.insertAtFirst(20);
        d.insertAtFirst(30);
        d.insertAtFirst(40);
        d.insertAtFirst(50);
        d.insertAtFirst(60);
        d.addLast(99);
        d.display();


    }
}
