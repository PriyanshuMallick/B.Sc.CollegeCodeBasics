// 15. Create a multi-file program where in one file a string message is taken as input from the user 
// and the function to display the message on the screen is given in another file (make use of 
// Scanner package in this program).

import PackFiles.MultiFileScanStr;

public class $15_MultiFileProgram {
    public static void main(String[] args) {
        MultiFileScanStr in = new MultiFileScanStr();
        System.out.println(in.readStr());
    }
}