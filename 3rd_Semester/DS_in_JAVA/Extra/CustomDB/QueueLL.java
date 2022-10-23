// Genaric Queue using LinkedList

package customDB;

public class QueueLL<T> {
    private Node front, rear;
    private int size = 0;

    private class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public void add(T data) {
        if (isEmpty()) {
            rear = new Node(data);
            front = rear;
        } else {
            rear.next = new Node(data);
            rear = rear.next;
        }
        size++;
    }

    public T remove() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return null;
        } else {
            T temp = front.data;
            front = front.next;
            size--;
            return temp;
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return null;
        } else {
            return front.data;
        }
    }

    public void display() {

        for (Node current = front; current != null; current = current.next) {
            System.out.println(current.data);
        }
    }
}
