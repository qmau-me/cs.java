package me.qmau.cs.java.algorithms.sorting;

import common.Print;
import common.Random;
import common.StdOut;
import common.Stopwatch;

;

public class InsertionSort {
    public static void sort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j - 1])) {
                    exch(a, j - 1, j);
                }
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
