// 4. To learn use of .length in case of a two dimensional array

public class $4_2dArrayLength {
    public static void main(String[] args) {
        // For a square or rectangular array
        int array[][] = new int[2][3];

        int rows = array.length;
        int cols = array[0].length;

        System.out.println("rows = " + rows + " cols = " + cols + "\n");

        // For a non-square or rectangular array
        int i;
        int array2[][];
        array2 = new int[][] {
                new int[] { 1 },
                new int[] { 1, 2 },
                new int[] { 1, 2, 3 },

                // for (i = 0; i < 3; i++) {
                // for (int j = 0; j <= i; j++) {
                // new int[] { 1 },
                // };
                // };

        };

        for (i = 0; i < array2.length; i++)
            System.out.println("In column " + (i + 1) + ", rows = " + array2[i].length);
    }
}
