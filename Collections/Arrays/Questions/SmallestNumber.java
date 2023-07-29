package Questions;

public class SmallestNumber {
    public static void main(String[] args) {
        int a[] = { 4, 3, 2, 1, 5, 6 };
        int a1 = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a1) {
                a1 = a[i];
            }
        }
        System.out.println(a1);

    }
}
