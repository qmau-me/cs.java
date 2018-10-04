public class HeapSort  {
    private static void sort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i=n-1; i>=0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int arr[], int n, int i) { 
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static void main(String args[]) {
        int arr[] = {64, 25, 12, 22, 11};

        System.out.println("Original Array");
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        sort(arr);
        System.out.println("Sorted array");
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}