// 11. Write a program to display Fibonacci series (i) using recursion, (ii) 
// using iteration

public class $11_Fib {
    // using recursion
    public static int fib(int num) {
        if (num == 1)
            return 0;
        if (num == 2)
            return 1;
        return fib(num - 1) + fib(num - 2);
    }

    public static void main(String[] args) {

        // using recursion
        for (int i = 1; i <= 10; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
        // using iteration
        int a = 0, b = 1, c;
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
