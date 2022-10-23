// 3. Implement Linked List using templates. Include functions for insertion, deletion and 
// search of a number, reverse the list and concatenate two linked lists (include a 
// function and also overload operator +).

class SinglyLL<T> {
    private Node head;
    private int size = 0;

    private class Node {
        Node next;
        T data;

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
        head = nNode;
        size++;
    }

    public void insertAtEnd(T data) {
        Node nNode = new Node(data);
        if (isEmpty()) {
            head = nNode;
            size++;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = nNode;
        size++;
    }

    public T deleteAtBeg() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        T tmpData = head.data;
        head = head.next;
        size--;
        return tmpData;
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

        Node tmp = head;

        if (pos < 2) {
            head = head.next;
            size--;
            return tmp.data;
        }

        for (int i = 0; i < pos - 2; i++)
            tmp = tmp.next;
        T tmpData = tmp.next.data;
        tmp.next = tmp.next.next;
        size--;
        return tmpData;
    }

    public Boolean search(T data) {
        for (Node curr = head; curr != null; curr = curr.next)
            if (curr.data == data)
                return true;
        return false;
    }

    public void reverse() {
        if (isEmpty()) {
            System.out.println("list is empty");
            return;
        }
        Node a, b, tmp;
        a = head;
        b = a.next;
        tmp = b.next;
        a.next = null;
        while (tmp != null) {
            b.next = a;
            a = b;
            b = tmp;
            tmp = tmp.next;
        }
        b.next = a;
        head = b;
    }

    public void print() {
        Node tmp;
        for (tmp = head; tmp.next != null; tmp = tmp.next)
            System.out.print(tmp.data + " -> ");
        System.out.print(tmp.data + "\n");
    }

    public void join(SinglyLL<T> list) {
        if (isEmpty() && list.isEmpty()) {
            System.out.println("Both list are empty");
            return;
        }

        if (list.isEmpty())
            return;

        if (isEmpty()) {
            head = list.head;
            size = list.size();
            return;
        }

        size += list.size();
        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = list.head;
    }

}

public class $3_SinglyLL {
    public static void main(String[] args) {
        SinglyLL<Integer> list1 = new SinglyLL<>();
        SinglyLL<Integer> list2 = new SinglyLL<>();

        list1.insertAtBeg(1);
        list1.insertAtEnd(2);

        list2.insertAtBeg(3);
        list2.insertAtEnd(4);

        list1.print();
        list2.print();

        list1.join(list2);
        list1.print();

        list1.reverse();
        list1.print();

        System.out.println("Size of list: " + list1.size());
        System.out.println("Is 4 in the list: " + list1.search(4));
        System.out.println("Is 5 in the list: " + list1.search(5));

        System.out.println("Deleted data: " + list1.deleteAtBeg());
        System.out.println("Deleted data: " + list1.delete(2));
        System.out.println("Size of list: " + list1.size());
        list1.print();

    }
}