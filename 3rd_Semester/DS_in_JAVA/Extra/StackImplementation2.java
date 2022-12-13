import CustomDB.StackLL;

public class StackImplementation2 {
    public static void main(String[] args) {
        StackLL<Integer> stack = new StackLL<>();

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
