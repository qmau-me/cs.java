class QuickSort {
    private static int partition(int arr[], int low, int high) { 
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low ; j < high ; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    private static void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static void main(String args[]) {
        int arr[] = {64, 25, 12, 22, 11};
        int n = arr.length;

        System.out.println("Original Array");
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        sort(arr, 0, n-1);
        System.out.println("Sorted array");
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    } 
} 