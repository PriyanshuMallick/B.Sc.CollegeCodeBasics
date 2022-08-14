// 15. Create a multi-file program where in one file a string message is taken as input from the user 
// and the function to display the message on the screen is given in another file (make use of 
// Scanner package in this program).

package PackFiles;

import java.util.Scanner;

public class MultiFileScanStr {
    String str;

    public String readStr() {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter:");
        str = cin.nextLine();
        cin.close();

        return str;
    }
}