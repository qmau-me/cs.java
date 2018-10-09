package me.qmau.cs.java.algorithms.sorting;

import common.Print;
import common.Random;
import common.StdOut;
import common.Stopwatch;

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

    public static void execute(int a[]) {
        Stopwatch stopWatch = new Stopwatch();
        sort(a);
        Print.array(a);
        StdOut.println("Time: " + stopWatch.elapsedTime() + "s");
    }

    public static void main(String args[]) {
        int[] a = Random.intArray(10000000);
        execute(a);
    }

}
