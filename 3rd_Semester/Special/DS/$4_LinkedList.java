// 4. Implement Linked List using templates. Include functions for 
// insertion, deletion and search of a number. 

class LL1<T> {
    private Node head;
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
        nNode.next = head;
        head = nNode;
        size++;
    }

    public T delete(int pos) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }

        if (pos > size) {
            System.out.println("No node exists at position " + pos);
            return null;
        }

        if (pos == 0) {
            T tmpData = head.data;
            head = head.next;
            size--;
            return tmpData;
        }

        if (pos < 0) {
            pos = size + pos;

            if (pos < 0) {
                System.out.println("No node exists at position " + pos);
                return null;
            }

            return delete(pos);
        }

        Node curr = head;

        for (int i = 0; i < pos - 1; i++)
            curr = curr.next;
        T tmpData = curr.next.data;
        curr.next = curr.next.next;
        size--;
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

public class $4_LinkedList {
    public static void main(String[] args) {
        LL1<Integer> list = new LL1<>();

        list.delete(20);

        for (int i = 10; i > 0; i--)
            list.insert(i);

        list.print();

        list.delete(20);
        System.out.println(list.delete(-5));
        System.out.println(list.delete(0));
        System.out.println(list.delete(2));
        System.out.println(list.delete(list.size() - 1));

        list.print();

    }
}
