package me.qmau.cs.java.sort;

public class BubbleSort {

    private BubbleSort() {
    }

    /**
     * Rearranges the array in ascending order, using the natural order.
     *
     * @param a the array to be sorted
     */
    public static <Integer extends Comparable<Integer>> void sort(Integer[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int exchanges = 0;
            for (int j = n - 1; j > i; j--) {
                if (less(a[j], a[j - 1])) {
                    exch(a, j, j - 1);
                    exchanges++;
                }
            }
            if (exchanges == 0) break;
        }
    }

    // is v < w ?
    private static <Integer extends Comparable<Integer>> boolean less(Integer v, Integer w) {
        return v.compareTo(w) < 0;
    }

    // exchange a[i] and a[j]
    private static <Integer extends Comparable<Integer>> void exch(Integer[] a, int i, int j) {
        Integer swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    // print array to standard output
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * Reads in a sequence of strings from standard input; bubble sorts them;
     * and prints them to standard output in ascending order.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Integer[] a = new Integer[] { 20,10,65,22,1,5,80};
        BubbleSort.sort(a);
        show(a);
    }
}
