// 10. Perform Queues operations using Circular Array implementation. 
// Use Templates.

class CQ<T> {
    private Node head, tail;
    private int size;

    private class Node {
        private Node next;
        private T data;

        private Node(T data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void insert(T data) {
        Node nNode = new Node(data);
        if (isEmpty()) {
            head = nNode;
            tail = nNode;
            nNode.next = nNode;
            size++;
            return;
        }

        tail.next = nNode;
        nNode.next = head;
        tail = nNode;
        size++;
    }

    public T delete() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }

        T tmp = head.data;

        if (head == tail) {
            head = null;
            tail = null;
            return tmp;
        }

        tail.next = head.next;
        head = head.next;
        return tmp;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        do {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        } while (curr != tail);
        System.out.print(curr.data + "\n");
    }
}

public class $10_CircularQueue {
    public static void main(String[] args) {
        CQ<Integer> list = new CQ<>();

        for (int i = 0; i < 10; i++)
            list.insert(i + 1);

        list.print();

        System.out.println(list.delete());
        System.out.println(list.delete());

        list.print();

        list.insert(11);
        list.print();
    }
}
