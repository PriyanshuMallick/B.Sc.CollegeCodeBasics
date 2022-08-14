// 5. To convert a decimal to binary number

import java.util.Scanner;

public class $5_DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dec;
        System.out.println("Enter a number");
        dec = in.nextInt();
        System.out.println("Decimal = " + dec);
        System.out.println("Binary = " + D2B(dec));

        in.close();
    }

    public static int D2B(int dec) {
        int i, bin = 0, x;
        for (i = 1; dec != 0; i *= 10) {
            x = dec % 2;
            bin += x * i;
            dec /= 2;
        }
        return bin;
    }
}
