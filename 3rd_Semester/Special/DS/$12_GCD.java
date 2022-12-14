// 12. Write a program to calculate GCD of 2 number (i) with recursion (ii) 
// without recursion. 

public class $12_GCD {
    // with recursion
    public static int GCD(int x, int y) {
        if (x % y != 0)
            return GCD(y, x % y);
        else
            return y;
    }

    public static void main(String[] args) {
        int a = 14, b = 49, c;
        if (a < b) {
            c = a;
            a = b;
            b = c;
        }
        // with recursion
        System.out.println("GCD = " + GCD(a, b));

        // without recursion
        while (a % b != 0) {
            c = a;
            a = b;
            b = c % b;
        }

        System.out.println("GCD = " + b);
    }
}
