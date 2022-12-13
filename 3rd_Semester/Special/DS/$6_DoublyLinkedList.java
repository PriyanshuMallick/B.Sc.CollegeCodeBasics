import java.util.List;

// 6. Implement Doubly Linked List using templates. Include functions 
// for insertion, deletion and search of a number.

class DLL1<T> {
    Node head;
    int size;

    private class Node {
        private Node prev, next;
        private T data;

        private Node(T data) {
            this.data = data;
        }
    }

    public Boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void insert(T data) {
        Node nNode = new Node(data);
        nNode.next = head;

        if (!isEmpty())
            head.prev = nNode;

        head = nNode;
        size++;
    }

    public T delete() {
        T tmpData = head.data;
        head.next.prev = null;
        head = head.next;
        return tmpData;
    }

    public boolean search(T data) {
        for (Node curr = head; curr != null; curr = curr.next)
            if (curr.data == data)
                return true;
        return false;
    }

    public void print() {
        Node curr;
        for (curr = head; curr.next != null; curr = curr.next)
            System.out.print(curr.data + " -> ");
        System.out.print(curr.data + "\n");
    }
}

public class $6_DoublyLinkedList {
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
