import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Queue {

    Node front;
    Node rear;
    int size;

    Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(int data) {
        Node new_n = new Node(data);
        if(front == null){
            front = new_n;
            rear = new_n;
            size++;
            return;
        }
        rear.next = new_n;
        rear = new_n;
        size++;
    }
    public boolean is_empty(){
        if(size == 0 ){
            return true;
        }else{
            return false;
        }
    }
    public void dequeue() {
        if(is_empty()){
            return;
        }
        int del = front.data;
        front = front.next;
        size--;
        if(front == null){
            rear = null;
        }
    }

    public void peek() {
        if(is_empty()){
            return;
        }
        System.out.println("Peek element is : "+front.data);
    }
  public void display() {
      if(is_empty()){
          return;
      }
      Node curr_n = front;
      while(curr_n != null){
          System.out.println(curr_n.data);
          curr_n = curr_n.next;
        }
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue obj = new Queue();

        System.out.println("Enter queue elements (-1 to stop):");

        while (true) {
            int n = sc.nextInt();

            if (n == -1) {
                break;
            }

            obj.enqueue(n);
        }

        System.out.println("\nQueue elements:");
        obj.display();

        System.out.println();

        obj.peek();

        obj.dequeue();

        System.out.println("\nQueue after dequeue:");
        obj.display();
    }
}