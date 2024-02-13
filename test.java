public class test {
    public class CircularQueue {
        int[] queue;
        int front;
        int rear;
        int size;
        int capacity;

        public CircularQueue(int capacity) {
            this.capacity = capacity;
            this.queue = new int[capacity];
            this.front = -1;
            this.rear = -1;
            this.size = 0;
        }

        public void addFirst(int element) {
            if (isFull()) {
                System.out.println("queue is full");
            }

            if (isEmpty()) {
                front = 0;
                rear = 0;
            } else {
                front = (front - 1 + capacity) % capacity;
            }

            queue[front] = element;
            size++;
        }

        public void addLast(int element) {
            if (isFull()) {
                System.out.println("queue is full.");
            }
        }

        public int deleteLast() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            int deletedElement = queue[rear];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                rear = (rear - 1 + capacity) % capacity;
            }

            size--;
            return deletedElement;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public static void main(String[] args) {
            CircularQueue queue = new CircularQueue(5);
            queue.addFirst(1);
            queue.addFirst(2);
            queue.addFirst(3);
            queue.addFirst(4);
            queue.addFirst(5);

            System.out.println("Deleted element: " + queue.deleteLast());
            System.out.println("Deleted element: " + queue.deleteLast());
        }
    }

}
