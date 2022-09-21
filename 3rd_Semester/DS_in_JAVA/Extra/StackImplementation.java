
class Stack {
    int size, top;
    int[] stack;

    Stack(int size) {
        this.size = size;
        top = -1;
        stack = new int[size];
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (isFull())
            System.out.println("Stack is full");
        else
            stack[++top] = data;
    }

    public void pop() {
        if (isEmpty())
            System.out.println("Stack is empty");
        else
            top--;
    }

    public int peek() {
        return stack[top];
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Stack a = new Stack(5);

        if (a.isEmpty())
            System.out.println("Stack is empty");
        else if (a.isFull())
            System.out.println("Stack is full");
        else
            System.out.println("1st Not Working");

        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);

        a.pop();

        System.out.println(a.peek());

        a.push(4);
        a.push(5);

        if (a.isEmpty())
            System.out.println("Stack is empty");
        else if (a.isFull())
            System.out.println("Stack is full");
        else
            System.out.println("1st Not Working");

        System.out.println(a.peek());
    }
}
