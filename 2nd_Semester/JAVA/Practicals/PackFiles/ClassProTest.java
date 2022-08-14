package PackFiles;

public class ClassProTest extends ProTest {
    public void readItAgain() {
        System.out.println("This class is derived from ProTest class");
        System.out.println("I can read " + pub + " data");
        System.out.println("I cannot read Private data");
        System.out.println("I can read " + pro + " data");
    }
}
