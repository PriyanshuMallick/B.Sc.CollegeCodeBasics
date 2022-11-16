// 1. Simulate Cyclic Redundancy Check (CRC) error detection algorithm for noisy channel

public class $1_CRC {

    // XOR Method
    public static String xor(String a, String b) {
        StringBuffer result = new StringBuffer();
        int n = b.length();

        for (int i = 1; i < n; i++) {
            if (a.charAt(i) == b.charAt(i))
                result.append(0);
            else
                result.append(1);
        }
        return result.toString();
    }

    public static String strRepeat(String c, int repeat) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < repeat; i++) {
            s.append(c);
        }
        return s.toString();
    }

    // Modulo-2 division Method
    public static String mod2div(String divident, String div) {
        int divLen = div.length();

        String tmp = divident.substring(0, divLen);

        int len = divident.length();

        for (; divLen < len; divLen++) {
            if (tmp.charAt(0) == '1')
                tmp = xor(div, tmp) + divident.charAt(divLen);
            else
                tmp = xor(strRepeat("0", divLen), tmp) + divident.charAt(divLen);
        }

        if (tmp.charAt(0) == '1')
            tmp = xor(div, tmp);
        else
            tmp = xor(strRepeat("0", divLen), tmp);

        return tmp;
    }

    public static void encodeData(String data, String key) {
        int l_key = key.length();

        // Appends n-1 zeroes at end of data
        String appended_data = (data + strRepeat("0", l_key - 1));

        String remainder = mod2div(appended_data, key);

        // Append remainder in the original data
        String codeword = data + remainder;
        System.out.println("Remainder : " + remainder);
        System.out.println("Encoded Data (Data + Remainder) : " + codeword);
    }

    public static void main(String[] args) {
        String data = "100100";
        String key = "1101";

        encodeData(data, key);
    }
}