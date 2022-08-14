// 14. Write a program to demonstrate the concept of boxing and unboxing.

public class $14_BoxingUnboxing {
    public static void main(String[] args) {

        Integer x = new Integer(0); // Boxing
        int sum = x.intValue(); // Unboxing

        while (x < 11) {
            sum += x;
            x++;
        }

        int ans = sum;
        System.out.println(ans);
    }
}