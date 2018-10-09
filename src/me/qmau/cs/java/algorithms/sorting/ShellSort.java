package me.qmau.cs.java.algorithms.sorting;

import common.StdOut;
import common.StdRandom;

public class ShellSort {
    public static void sort(int[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3)
            h = 3 * h + 1;
        while (h >= 1) {
            {
                for (int i = h; i < N; i++) {
                    for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                        exch(a, j, j - h);
                    }
                }
                h = h / 3;
            }
        }
    }


    private static void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
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
        int[] a = new int[100000];
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(0, 100000);
        }
        sort(a);
        printOut(a);
    }

}
