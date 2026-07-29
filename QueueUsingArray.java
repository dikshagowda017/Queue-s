import java.util.*;

class Queue {

    int[] arr;
    int front;
    int rear;
    int size;

    Queue(int size) {
        arr = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        arr[rear] = data;
    }

    public void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        int del = arr[front];
        System.out.println("Dequeued element is : " + del);

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
    }

    public void peek() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Front element is : " + arr[front]);
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }
}


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue q = new Queue(5);

        System.out.println("Enter queue elements (-1 to stop):");

        while (true) {

            int n = sc.nextInt();

            if (n == -1)
                break;

            q.enqueue(n);
        }

        System.out.println("\nQueue Elements:");
        q.display();

        System.out.println();

        q.peek();

        q.dequeue();

        System.out.println("\nQueue after Dequeue:");
        q.display();
    }
}