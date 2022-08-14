// 10. Modify the ―distanceǁ class by creating constructor for assigning values (feet and inches) 
// to the distance object. Create another object and assign second object as reference variable 
// to another object reference variable. Further create a third object which is a clone of the first 
// object.

class Dist {
    int feet, inches;

    // Constructor
    Dist(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Copy Constructor
    Dist(Dist x) {
        feet = x.feet;
        inches = x.inches;
    }

    void outDist() {
        System.out.println("Feet = " + feet);
        System.out.println("Inches = " + inches);
    }
}

public class $10_ModDistanceFeetInches {
    public static void main(String[] args) {
        Dist a = new Dist(2, 4);
        Dist b = a;
        Dist c = new Dist(a);
        a.outDist();
        b.outDist();
        c.outDist();
    }
}
