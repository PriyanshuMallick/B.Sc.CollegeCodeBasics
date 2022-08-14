// 13. Write a program to show the use of static functions and to pass variable length arguments in 
// a function.

class VarLen {

    static int varAdd(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }
}

public class $13_VarLenArg {
    public static void main(String[] args) {

        System.out.println(VarLen.varAdd(1, 2, 3, 4));
    }
}