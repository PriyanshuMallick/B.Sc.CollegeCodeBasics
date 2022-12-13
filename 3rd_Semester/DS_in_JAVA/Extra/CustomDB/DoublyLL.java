// Implement Doubly Linked List using templates. Include functions for insertion, 
// deletion and search of a number, reverse the list.

package CustomDB;

public class DoublyLL<T> {
    private Node head;
    private int size = 0;

    private class Node {
        private T data;
        private Node prev, next;

        public Node(T data) {
            this.data = data;
            next = prev = null;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void insertatbeg(T nData) {
        Node nNode = new Node(nData);
        nNode.next = head;
        nNode.prev = null;
        if (head != null)
            head.prev = nNode;
        head = nNode;
    }

    public void insertafter(Node pNode, T nData) {
        if (pNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node nNode = new Node(nData);
        nNode.next = pNode.next;
        pNode.next = nNode;
        nNode.prev = pNode;

        if (nNode.next != null) {
            nNode.next.prev = nNode;
        }

    }

    public void insertatend(T nData) {
        Node nNode = new Node(nData);
        Node tmp = head;
        nNode.next = null;
        if (head == null) {
            nNode.prev = null;
            head = nNode;
            return;
        }

        while (tmp.next != null)
            tmp = tmp.next;

        tmp.next = nNode;
        nNode.prev = tmp;
    }

    public void deleteNode(Node pos) {
        if (head == null || pos == null) // Empty List
            return;

        if (head == pos) // Delete the first node (head)
            head = pos.next;

        if (pos.next != null)
            pos.next.prev = pos.prev;

        if (pos.prev != null)
            pos.prev.next = pos.next;
    }

    public boolean search(Node head, T pos) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == pos)
                return true;
            curr = curr.next;
        }
        return false;
    }

    public void reverse() {
        T tmp;
        Node left = head, right = head;

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

    public void printlist(Node n) {
        // Node last = null;
        while (n != null) {
            System.out.print(n.data + " -> ");
            // last = n;
            n = n.next;
        }
        System.out.println();
    }
}