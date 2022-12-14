// 9. Perform Stack operations using Array implementation. Use 
// Templates. 

import java.util.ArrayList;

class SA<T> {
    ArrayList<T> arr;
    int top = -1;
    int size;

    SA(int size) {
        this.size = size;
        this.arr = new ArrayList<T>(size);
    }

    public void push(T data) {
        top++;
        if (top == size) {
            System.out.println("Stack overflow");
            return;
        }
        arr.add(data);
    }

    public T pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return null;
        }
        T tmpData = arr.get(top);
        arr.remove(top);
        top--;
        return tmpData;
    }

    public T peek() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return null;
        }
        return arr.get(top);
    }

    public void print() {
        for (int i = top; i > 0; i--)
            System.out.print(arr.get(i) + " -> ");
        System.out.println(arr.get(0));
    }
}

public class $9_StackArr {
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
