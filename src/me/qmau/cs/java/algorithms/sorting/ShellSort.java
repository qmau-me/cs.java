package me.qmau.cs.java.algorithms.sorting;

import common.Print;
import common.Random;
import common.StdOut;
import common.Stopwatch;

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
