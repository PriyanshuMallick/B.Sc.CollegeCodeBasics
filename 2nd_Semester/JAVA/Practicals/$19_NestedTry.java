// 19. Write a program to show the use of nested try statements that emphasizes the sequence of
// checking for catch handler statements.

public class $19_NestedTry {
    public static void main(String[] args) {
        try {
            try {
                int x = 2 / 0;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException :\n" + e.getMessage());
            }

            int array[] = { 2 };
            System.out.println(array[1]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException :\n" + e.getMessage());
        }
    }

}