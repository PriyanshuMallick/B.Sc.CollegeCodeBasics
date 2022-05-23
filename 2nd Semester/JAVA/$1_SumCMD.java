// 1. To find the sum of any number of integers entered as command line arguments

public class $1_SumCMD {
    public static void main(String[] args) {
        int sum = 0;
        for (String num : args)
            sum += Integer.parseInt(num);
        System.out.println("Sum: " + sum);
    }
}