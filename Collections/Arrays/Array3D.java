public class Array3D {
    public static void main(String[] args) {
        int[][][] a = { { { 1, 2, 3 }, { 2, 3, 4 } }, { { 1, 2 }, { 1, 2, 3, 4 } } };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k]);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
