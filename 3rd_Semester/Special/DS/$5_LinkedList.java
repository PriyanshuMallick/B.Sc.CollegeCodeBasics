// 5. Implement Linked List using templates. Include functions for 
// insertion, reverse the list and concatenate two linked lists. 

class LL2<T> {
    Node head;
    int size = 0;

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

    public void concat(LL2<T> list) {
        if (isEmpty()) {
            head = list.head;
            size = list.size();
            return;
        }

        if (list.isEmpty())
            return;

        size += list.size();
        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = list.head;
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
        Node curr;
        for (curr = head; curr.next != null; curr = curr.next)
            System.out.print(curr.data + " -> ");
        System.out.print(curr.data + "\n");
    }

}

public class $5_LinkedList {
    public static void main(String[] args) {

        LL2<Integer> list1 = new LL2<>();
        LL2<Integer> list2 = new LL2<>();

        for (int i = 0; i < 5; i++) {
            list2.insert(i + 1);
            list1.insert(i + 6);
        }

        System.out.println(list1.size());
        System.out.println(list2.size());

        list1.print();
        list2.print();

        list1.concat(list2);
        list1.print();

        list1.reverse();
        list1.print();

    }
}
