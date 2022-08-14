package PackFiles;

public class ProTest {
    public String pub = "Public";
    private String pvt = "Private";
    protected String pro = "Protected";

    public void read() {
        System.out.println("This is the bass class");
        System.out.println(pub + " String");
        System.out.println(pvt + " String");
        System.out.println(pro + " String");
    }
}
