// 18. Write a program ―DivideByZero that takes two numbers a and b as input, computes a/b, 
// and invokes Arithmetic Exception to generate a message when the denominator is zero.

import java.util.Scanner;

public class $18_DivideByZero {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int a, b, c;
        a = cin.nextInt();
        b = cin.nextInt();

        try {
            c = a / b;
            System.out.println(a + " / " + b + " = " + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        cin.close();
    }
}