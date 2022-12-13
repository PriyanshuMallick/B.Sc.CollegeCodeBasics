// 8. Perform Stack operations using Linked List implementation. 

class SLL1<T> {
    private Node top;
    private int size = 0;

    private class Node {
        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
        }
    }

    public Boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void push(T data) {
        Node nNode = new Node(data);
        nNode.next = top;
        top = nNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return null;
        }

        T tmpData = top.data;
        top = top.next;
        size--;
        return tmpData;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return null;
        }
        return top.data;
    }

    public void print() {
        Node curr;
        for (curr = top; curr.next != null; curr = curr.next)
            System.out.print(curr.data + " -> ");
        System.out.println(curr.data);
    }
}

public class $8_StackLinkedList {
    public static void main(String[] args) {
        SLL1<Integer> stack = new SLL1<>();

        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.print();

        System.out.println(stack.pop());
        System.out.println(stack.pop() + "\n");

        System.out.println("Peek = " + stack.peek() + "\n");

        System.out.println("Size = " + stack.size() + "\n");

        stack.print();
    }
}
