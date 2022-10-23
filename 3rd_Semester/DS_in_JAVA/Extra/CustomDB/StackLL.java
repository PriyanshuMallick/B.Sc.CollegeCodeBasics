// Genaric Stack using LinkedList

package customDB;

import java.util.EmptyStackException;

public class StackLL<T> {
    private Node top;
    private int size = 0;

    private class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return size == 0;
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
            throw new EmptyStackException();
        }

        T temp = top.data;
        top = top.next;
        size--;
        return temp;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public void display() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        for (Node current = top; current != null; current = current.next) {
            System.out.println(current.data);
        }
    }

}
