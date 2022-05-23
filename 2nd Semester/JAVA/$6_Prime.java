// 6. To check if a number is prime or not, by taking the number as input from the keyboard

import java.util.Scanner;
import java.lang.Math;

public class $6_Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        boolean F = isprime(num);
        if (F)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is not Prime");

        in.close();
    }

    public static boolean isprime(int num) {
        if (num < 2)
            return false;
        else if (num == 2 || num == 3)
            return true;
        else {
            float x = (float) Math.ceil(Math.sqrt(num));
            int i;
            for (i = 2; i <= x; i++) {
                if (num % i == 0)
                    return false;
            }
        }
        return true;
    }
}
