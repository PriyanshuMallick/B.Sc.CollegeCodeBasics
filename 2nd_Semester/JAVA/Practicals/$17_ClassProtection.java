// 17. Write a program that creates illustrates different levels of protection in classes/subclasses belonging to same package or different packages

import PackFiles.ClassProTest;
import PackFiles.ProTest;

public class $17_ClassProtection {
    public static void main(String[] args) {
        ProTest a = new ProTest();
        ClassProTest b = new ClassProTest();

        a.read();
        System.out.println('\n');

        b.readItAgain();
        System.out.println('\n');

        System.out.println("This is print from main()");
        System.out.println("I can read " + a.pub + " data");
        System.out.println("I cannot read Private data");
        System.out.println("I cannot read Protected data");

    }
}
