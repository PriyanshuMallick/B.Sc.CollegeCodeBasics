import java.util.Scanner;

public class Test0 {

    public static int solution(int lim) {
        int sum = 0;
        if (lim == 0) {
            return 0;
        } else {
            for (int i = 0; i < lim; i++)
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                    System.out.println(i + " ");
                }
            System.out.println("\n" + sum + "\n");
        }
        return sum;
    }

    public static void main(String[] args) {
        int lim;
        Scanner cin = new Scanner(System.in);

        lim = cin.nextInt();
        cin.close();

        System.out.println(solution(lim));
    }
}
