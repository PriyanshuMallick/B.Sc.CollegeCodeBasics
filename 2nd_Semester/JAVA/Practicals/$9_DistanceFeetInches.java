// Write a program to create a distance class with methods where distance is computed in 
// terms of feet and inches, how to create objects of a class and to see the use of this pointer

import java.util.Scanner;

class Dists {
    int feet, inches;

    Dists(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    void outDist() {
        System.out.println("Feet = " + feet);
        System.out.println("Inches = " + inches);
    }
}

public class $9_DistanceFeetInches {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter distance in Feet: ");
        int F = cin.nextInt();
        System.out.println("Enter distance in Inches: ");
        int I = cin.nextInt();

        Dists box = new Dists(F, I);

        box.outDist();

        cin.close();
    }
}