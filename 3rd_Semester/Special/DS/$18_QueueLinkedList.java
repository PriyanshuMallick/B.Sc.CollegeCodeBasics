// 18. Perform Queue operations using Linked List implementation.

class QLL<T> {
    private Node head, tail;
    private int size = 0;

    private class Node {
        Node next;
        T data;

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
        }
        tail.next = nNode;
        tail = nNode;
        size++;
    }

    public T delete() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        T tmpData = head.data;
        head = head.next;
        return tmpData;
    }

    public void print() {
        Node curr;
        for (curr = head; curr.next != null; curr = curr.next)
            System.out.print(curr.data + " -> ");
        System.out.print(curr.data + "\n");
    }
}

public class $18_QueueLinkedList {
    public static void main(String[] args) {
        QLL<Integer> list = new QLL<>();

        for (int i = 10; i > 0; i--)
            list.insert(i);

        list.print();

        System.out.println(list.delete());
        System.out.println(list.delete());

        list.print();
    }
}
