import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Enter queue elements (-1 to stop):");

        while (true) {
            int n = sc.nextInt();

            if (n == -1) {
                break;
            }

            queue.offer(n);
        }

        System.out.println("\nQueue Elements:");
        System.out.println(queue);

        if (!queue.isEmpty()) {
            System.out.println("\nFront element is : " + queue.peek());
        }

        if (!queue.isEmpty()) {
            System.out.println("Dequeued element is : " + queue.poll());
        }

        System.out.println("\nQueue after Dequeue:");
        System.out.println(queue);
    }
}