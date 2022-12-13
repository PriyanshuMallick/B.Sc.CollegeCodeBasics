import CustomDB.QueueLL;

public class QueueImplementation {
    public static void main(String[] args) {
        QueueLL<Integer> queue = new QueueLL<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);

        System.out.println("Peek : " + queue.peek() + "\n");

        System.out.println("Removing: " + queue.remove() + "\n");
        System.out.println("Removing: " + queue.remove() + "\n");
        System.out.println("Removing: " + queue.remove() + "\n");

        queue.display();
    }
}
