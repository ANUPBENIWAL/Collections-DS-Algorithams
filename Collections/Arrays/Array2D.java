public class Array2D {
    public static void main(String[] args) {
        int[][] a = { { 2, 3, 4 }, { 1, 2, 3 } };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        // Second ways value in array
        int p1 = 3, k1 = 3;
        int[][] b = new int[p1][k1];
                b[0][0] = 12;
                b[0][1] = 13;
                b[1][0] = 14;
                b[1][1] = 15;
            
        System.out.println(b[1][0]);

    }
}
