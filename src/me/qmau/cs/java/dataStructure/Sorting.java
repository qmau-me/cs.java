package DPdoubts;
public class sorting {
	public static void main(String[] args) {
		int[] array = {2,4,1,3,6,9,7,8};
		int[] result = selectionsort(array);
		for(int i =0 ; i<result.length; i++) {
			System.out.println(result[i]);
		}
		int[] result2 = mergeSort(array,0,array.length-1);
		for(int i =0 ; i<result2.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] selectionsort(int[] arr) {
		for(int i = 0; i<arr.length-1; i++) {
			int min_idx=i;
			for(int j = i+1; j< arr.length; j++) { 
				if(arr[min_idx]>arr[j]) 
					min_idx=j;
		}		
				int temp = arr[min_idx];
				arr[min_idx] = arr[i];
				arr[i] = temp; 
		}
		return arr;
	}
	
	public static int[] mergeTwoSortedArrays(int[] one, int[] two) {

		int[] sorted = new int[one.length + two.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				sorted[k] = one[i];
				k++;
				i++;
			} else {
				sorted[k] = two[j];
				k++;
				j++;
			}
		}

		if (i == one.length) {

			while (j < two.length) {
				sorted[k] = two[j];
				k++;
				j++;
			}
		}

		if (j == two.length) {

			while (i < one.length) {
				sorted[k] = one[i];
				k++;
				i++;
			}
		}

		return sorted;

	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {
		
		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}

		int mid = (lo + hi) / 2;

		int[] fh = mergeSort(arr, lo, mid);
		int[] sh = mergeSort(arr, mid + 1, hi);

		int[] merged = mergeTwoSortedArrays(fh, sh);

		return merged;
	}

	
	public static void insertionsort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=1; i<n; ++i) 
        { 
            int key = arr[i]; 
            int j = i-1; 
  
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
    } 
}
