// Write a program to show the difference between public and private access specifiers.The program should also show that primitive data types are passed by value and objects are passed by reference and to learn use of final keyword

class Multi10 {
    public int no;
    private int ans;
    public final int x = 10;
    // Here since x is defined as final it's value cannot be changed

    Multi10(int no) {
        this.no = no;
    }

    public int mul() {
        ans = no * x;
        return ans;
    }

}

public class $12_ClassAccessSpecifiers {
    public static void main(String[] args) {
        Multi10 a = new Multi10(2);

        System.out.println(a.no + " * " + a.x + " = " + a.mul());

        // Here we can see that a.no and a.x give us the values of the corresponding
        // variables
        // But the same is no posible for the a.ans because it is a private variable of
        // the class Multi10
        // And using a.ans whoud give us an error
    }
}
