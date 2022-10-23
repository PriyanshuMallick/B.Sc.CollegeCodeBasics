// 5. Implement Circular Linked List using templates. Include functions for insertion, 
// deletion and search of a number, reverse the list.

class CircularLL<T> {
    private Node head, tail;
    private int size = 0;

    private class Node {
        private T data;
        private Node next;

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
            nNode.next = head;
            size++;
            return;
        }
        tail.next = nNode;
        tail = nNode;
        tail.next = head;
        size++;
    }

    public T deleteAtBeg() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }

        T tmpData = head.data;
        if (head == head.next) {
            head = null;
            size--;
            return tmpData;
        }

        head = head.next;
        tail.next = head;
        size--;
        return tmpData;
    }

    public T deleteAtEnd() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }

        T tmpData = tail.data;
        if (head == head.next) {
            head = null;
            size--;
            return tmpData;
        }
        Node last = head;
        while (last.next != tail)
            last = last.next;

        tail = last;
        tail.next = head;
        size--;
        return tmpData;
    }

    public boolean search(T data) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return false;
        }

        Node curr = head;
        do {
            if (curr.data == data)
                return true;
            curr = curr.next;
        } while (curr.next != head);

        return false;
    }

    public void reverse() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node prev = null, curr = head, next1;

        do {
            next1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next1;
        } while (curr != head);

        tail = head;
        head.next = prev;
        head = prev;
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

public class $5_CircularLL {
    public static void main(String[] args) {
        CircularLL<Integer> list = new CircularLL<>();

        System.out.println("Is list empty: " + list.isEmpty()); // True

        for (int i = 0; i < 6; i++)
            list.insert(i); // 0 -> 1 -> 2 -> 3 -> 4 -> 5

        list.print(); // 0 -> 1 -> 2 -> 3 -> 4 -> 5
        System.out.println("Size of list: " + list.size());
        System.out.println("Is 4 in the list: " + list.search(4)); // True
        System.out.println("Is 7 in the list: " + list.search(7)); // False

        System.out.println("Deleted data: " + list.deleteAtBeg()); // 0
        System.out.println("Deleted data: " + list.deleteAtEnd()); // 5

        list.print(); // 1 -> 2 -> 3 -> 4

        list.reverse();
        list.print(); // 4 -> 3 -> 2 -> 1

    }
}
