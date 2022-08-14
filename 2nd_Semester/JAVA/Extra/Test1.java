import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter 2 nos.");
        int a, b, sum;
        a = read.nextInt();
        b = read.nextInt();

        sum = a + b;
        System.out.println("Sum of the 2 nos. is " + sum);

        read.close();
    }
}
