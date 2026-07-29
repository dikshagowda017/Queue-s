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