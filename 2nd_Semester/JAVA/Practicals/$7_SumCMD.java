// 7. To find the sum of any number of integers interactively, i.e., entering every number from 
// the keyboard, whereas the total number of integers is given as a command line argument

import java.util.Scanner;

public class $7_SumCMD {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter " + args[0] + " number:\n");

        int num[], sum = 0, n;
        n = Integer.parseInt(args[0]);
        num = new int[n];

        for (int i : num) {
            num[i] = in.nextInt();
        }

        for (int temp : num) {
            sum += temp;
        }

        System.out.println("Sum = " + sum);

        in.close();
    }
}