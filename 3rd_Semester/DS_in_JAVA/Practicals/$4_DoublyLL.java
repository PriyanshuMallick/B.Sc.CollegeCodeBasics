// 4. Implement Doubly Linked List using templates. Include functions for insertion, 
// deletion and search of a number, reverse the list.

class DoublyLL<T> {
    private Node head;
    private int size = 0;

    private class Node {
        private Node next;
        private Node prev;
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

    public void insertAtBeg(T data) {
        Node nNode = new Node(data);
        nNode.next = head;
        nNode.prev = null;
        if (head != null)
            head.prev = nNode;
        head = nNode;
        size++;
    }

    public void insertAtEnd(T data) {
        Node nNode = new Node(data);
        Node tmp = head;
        nNode.next = null;
        if (isEmpty()) {
            nNode.prev = null;
            head = nNode;
            size++;
            return;
        }
        while (tmp.next != null)
            tmp = tmp.next;

        tmp.next = nNode;
        nNode.prev = tmp;
        size++;

    }

    public T delAtBeg() {
        T tmpData = head.data;
        head.next.prev = null;
        head = head.next;
        return tmpData;
    }

    public T delAtEnd() {
        T tmpData;
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }

        Node tmp = head;
        while (tmp.next != null)
            tmp = tmp.next;
        tmpData = tmp.data;
        tmp.prev.next = null;
        tmp.prev = null;
        return tmpData;
    }

    public Boolean search(T data) {

        for (Node curr = head; curr != null; curr = curr.next)
            if (curr.data == data)
                return true;
        return false;
    }

    public void reverse() {
        T tmp;
        Node left = head;
        Node right = head;

        while (right.next != null)
            right = right.next;

        while (left != right && left.prev != right) {
            tmp = left.data;
            left.data = right.data;
            right.data = tmp;

            left = left.next;
            right = right.prev;
        }
    }

    public void print() {
        Node curr;
        for (curr = head; curr.next != null; curr = curr.next)
            System.out.print(curr.data + " -> ");
        System.out.print(curr.data + "\n");
    }
}

public class $4_DoublyLL {
    public static void main(String[] args) {
        DoublyLL<Integer> x = new DoublyLL<>();

        System.out.println(x.isEmpty());
        x.insertAtEnd(5);
        x.insertAtBeg(1);
        x.insertAtEnd(10);

        System.out.println(x.isEmpty());
        x.print();
        x.reverse();
        x.print();

        System.out.println("Size: " + x.size());
        System.out.println(x.search(5));
        System.out.println(x.search(7));

        System.out.println("Deleted data: " + x.delAtBeg());
        System.out.println("Deleted data: " + x.delAtEnd());
        x.print();
    }
}
