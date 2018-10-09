package me.qmau.cs.java.algorithms.sorting;

import common.StdOut;
import common.StdRandom;

public class QuickSort {
    public static void sort(int[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int lo, int hi) {
        if (hi <= lo)
            return;
        int p = partition(a, lo, hi);
        sort(a, lo, p - 1);
        sort(a, p + 1, hi);
    }

    private static int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        int pivot = a[lo];

        while (true) {
            while (a[++i] < pivot) {
                if (i == hi)
                    break;
            }
            while (a[--j] > pivot) {
                if (j == lo)
                    break;
            }
            if (i >= j)
                break;
            exch(a, i, j);
        }

        exch(a, lo, j);
        return j;
    }

    private static void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void printOut(int[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + ",");
        }
    }

    public static void main(String args[]) {
        int[] a = new int[100000];
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(0, 100000);
        }
        sort(a);
        printOut(a);
    }
}
