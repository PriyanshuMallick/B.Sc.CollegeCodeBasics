// 3. To learn use of single dimensional array by defining the array dynamically

import java.util.Scanner;

public class $3_DynamicArray {
    public static void main(String[] args) {
        int array[], n;

        Scanner cin = new Scanner(System.in);

        System.out.println("How many elements do you want?");
        n = cin.nextInt();

        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }

        cin.close();
    }
}