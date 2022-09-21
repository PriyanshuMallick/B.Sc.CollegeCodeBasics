// 6. To check if a number is prime or not, by taking the number as input from the keyboard

import java.lang.Math;
import java.util.Scanner;

public class $6_IsPrime {
    public static Boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else if (num == 2 || num == 3) {
            return true;
        } else {
            int x = (int) Math.ceil(Math.sqrt(num));
            for (int i = 2; i <= x; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = cin.nextInt();

        System.out.println(isPrime(num) ? "Prime" : "Not Prime");

        cin.close();
    }
}
