package common;

public class Print {
    public static void array(int[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + ",");
        }
        StdOut.println();
    }
}
