// 2. To find the factorial of a given number

import java.util.Scanner;

public class $2_Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Factorial is: " + fac(n));

        in.close();
    }

    public static int fac(int n) {
        int result = 1;
        for (int i = n; i > 0; i--)
            result *= i;

        return result;
    }
}