package me.qmau.cs.java.algorithms.sorting;

public class MergeSortBU {
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
            else if (aux[j] < aux[i])
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }
    }

    public static void sort(int[] arr) {
        int N = arr.length;
        int[] aux = new int[N];
        for (int size = 1; size < N; size = size + size) {
            for (int lo = 0; lo < N - size; lo += 2 * size) {
                merge(arr, aux, lo, lo + size - 1, Math.min(lo + size + size - 1, N - 1));
            }
        }
    }

}
