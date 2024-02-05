class ArrayStack {
    private int top;
    private int size;
    private int[] elements;

    public ArrayStack(int size) {
        this.top = -1;
        this.size = size;
        elements = new int[size];
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top >= size - 1;
    }

    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack overflow");
            return;
        }
        elements[++top] = data;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return -1;
        }
        System.out.println(elements[top]);
        top--;
        return elements[top + 1];
    }

    public int peek() {
        if (top <= 0) {
            System.out.println("Stack underflow");
            return -1;
        }
        System.out.println(elements[top]);
        return elements[top];
    }

    public void display() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(elements[i] + "  ");
        }
        System.out.println();
    }
}

public class Stack {
    public static void main(String[] args) {
        ArrayStack ar = new ArrayStack(5);
        // ars.isEmpty();

        ar.push(12);
        ar.push(15);
        ar.push(62);
        ar.push(92);
        ar.display();
        // ar.peek();
        ar.pop();
        ar.push(36);
        ar.display();
    }
}