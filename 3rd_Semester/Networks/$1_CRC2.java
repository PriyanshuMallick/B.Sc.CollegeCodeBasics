public class $1_CRC2 {

    static String toBin(int num) {
        String bin = "";
        while (num > 0) {
            if ((num & 1) != 0)
                bin = "1" + bin;
            else
                bin = "0" + bin;
            num = num >> 1;
        }
        return bin;
    }

    static int toDec(String bin) {
        int num = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1')
                num += 1 << (bin.length() - i - 1);
        }
        return num;
    }

    static void CRC(String dataword, String generator) {
        int l_gen = generator.length();
        int gen = toDec(generator);

        int dword = toDec(dataword);

        // append 0s to dividend
        int dividend = dword << (l_gen - 1);

        // shft specifies the no. of least
        // significant bits not being XORed
        int shft = (int) Math.ceil(Math.log(dividend + 1) / Math.log(2)) - l_gen;
        int rem;

        while ((dividend >= gen) || (shft >= 0)) {

            // bitwise XOR the MSBs of dividend with
            // generator replace the operated MSBs from the
            // dividend with remainder generated
            rem = (dividend >> shft) ^ gen;
            dividend = (dividend & ((1 << shft) - 1))
                    | (rem << shft);

            // change shft variable
            shft = (int) Math.ceil(Math.log(dividend + 1) / Math.log(2)) - l_gen;
        }

        // finally, AND the initial dividend with the
        // remainder (=dividend)
        int codeword = (dword << (l_gen - 1)) | dividend;
        System.out.println("Remainder: " + toBin(dividend));
        System.out.println("Codeword : " + toBin(codeword));
    }

    public static void main(String[] args) {
        String dataword, generator;
        dataword = "10011101";
        generator = "1001";
        CRC(dataword, generator);
    }
}
