// 11. Write a program to show that during function overloading, if no matching argument is 
// found, then java will apply automatic type conversions(from lower to higher data type)

class Over {
    void FO(int x) {
        System.out.println(x);
    }

    void FO(float x) {
        System.out.println(x);
    }

    void FO(double x) {
        System.out.println(x);
    }
}

public class $11_FuntionOverloading {
    public static void main(String[] args) {
        int i = 0;
        float f = 1.0f;
        double d = 2.0;
        Over x = new Over();
        x.FO(i);
        x.FO(f);
        x.FO(d);
    }
}