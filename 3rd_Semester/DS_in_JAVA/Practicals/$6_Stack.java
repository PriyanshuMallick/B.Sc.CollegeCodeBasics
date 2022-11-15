// 6. Perform Stack operations using Linked List implementation.

class Stack2<T> {
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
        return top.next == null;
    }

    public int size() {
        return size;
    }

    public void push(T data) {
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return null;
        }

        T temp = top.data;
        top = top.next;
        size--;
        return temp;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return null;
        }

        return top.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return;
        }

        for (Node current = top; current != null; current = current.next) {
            System.out.print(current.data + " -> ");
        }
        System.out.println();
    }
}

public class $6_Stack {
    public static void main(String[] args) {
        Stack2<Integer> stack = new Stack2<>();

        stack.isEmpty();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop() + "\n");

        System.out.println("Peek = " + stack.peek() + "\n");

        System.out.println("Size = " + stack.size() + "\n");

        stack.display();
    }
}
