package me.qmau.cs.java.algorithms.sorting;

import common.Random;
import common.StdOut;

public class BenchMark {
    public static void main(String args[]) {
        int[] a = Random.intArray(10000);
        StdOut.println("Insertion Sort");
        InsertionSort.execute(a);
        StdOut.println("Merge Sort");
        MergeSort.execute(a);
        StdOut.println("Quick Sort");
        QuickSort.execute(a);
        StdOut.println("Selection Sort");
        SelectionSort.execute(a);
        StdOut.println("Shell Sort");
        ShellSort.execute(a);
    }
}
