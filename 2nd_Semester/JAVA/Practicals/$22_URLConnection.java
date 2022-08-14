// 22. Write a program to create URL object, create a URLConnection using the 
// openConnection() method and then use it examine the different components of the URL and content

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class $22_URLConnection {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://duckduckgo.com/?q=python+is+easier+then+java&t=h_&ia=web");
        URLConnection conUrl = url.openConnection();

        System.out.println("Content Length: " + conUrl.getContentLengthLong() );
        System.out.println("Content Type: " + conUrl.getContentType());
        System.out.println("Date: " + new Date(conUrl.getDate()));
        System.out.println("Expiration Date: " + new Date(conUrl.getExpiration()));
        System.out.println("Last Modified: " + new Date(conUrl.getLastModified()));
    }
}
