package me.qmau.cs.java.algorithms.sorting;

import common.StdOut;
import common.StdRandom;

public class MergeSort {

    public static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        // merge back to a[]
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (less(aux[j], aux[i]))
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }
    }

    public static void sort(int[] a, int[] aux, int lo, int hi) {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    public static void sort(int[] a) {
        int[] aux = new int[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    private static boolean less(int v, int w) {
        if (v < w)
            return true;
        return false;
    }

    private static void printOut(int[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + ",");
        }
    }

    public static void main(String args[]) {
        int N = 10000;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(0, N);
        }
        sort(a);
        printOut(a);
    }

}
