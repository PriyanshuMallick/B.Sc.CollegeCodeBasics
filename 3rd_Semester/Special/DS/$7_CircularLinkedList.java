// 7. Implement Circular Linked List using templates. Include functions 
// for insertion, deletion and search of a number, reverse the list

class CLL1<T> {
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
            nNode.next = head;
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

        T tmpData = head.data;
        if (head == head.next) {
            head = null;
            tail = null;
            size--;
            return tmpData;
        }
        head = head.next;
        tail = head;
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
}

public class $7_CircularLinkedList {
    public static void main(String[] args) {
        DLL1<Integer> list = new DLL1<>();

        for (int i = 10; i > 0; i--)
            list.insert(i);

        list.print();

        System.out.println(list.delete());
        System.out.println(list.delete());

        list.print();

        System.out.println(list.search(5));
        System.out.println(list.search(40));
    }
}
