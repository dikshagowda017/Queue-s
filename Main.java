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