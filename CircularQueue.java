public class CircularQueue {
    int[] queue;
    int front;
    int rear;

    CircularQueue(int size) {
        this.size = size;
        this.front = -1;
        this.rear = -1;
    }

    public void addFirst(int element) {

        if (isFull()) {

        }
    }

    public boolean isFull() {
        if (size == (front+1) % size) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        System.out.println(queue.isFull());

    }
}
