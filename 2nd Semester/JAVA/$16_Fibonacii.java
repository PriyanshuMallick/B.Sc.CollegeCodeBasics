// 16. Write a program to create a multilevel package and also creates a reusable class to generate 
//  Fibonacci series, where the function to generate fibonacii series is given in a different file 
//  belonging to the same package.

import PackFiles.FibInt;

public class $16_Fibonacii {
    public static void main(String[] args) {
        Fib n = new Fib();
        int terms = 10;
        for (int i = 1; i <= terms; ++i) {
            System.out.println(n.fib(i));
        }
    }
}

class Fib implements FibInt {
    public int fib(int x) {
        if (x == 1)
            return 0;
        else if (x == 2)
            return 1;
        else
            return (fib(x - 1) + fib(x - 2));
    }
}