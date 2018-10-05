        /**
            
            The Selection Sort algorithm sorts an array 
            by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. 
            The algorithm maintains two subarrays in a given array.

            1) The subarray which is already sorted.
            2) Remaining subarray which is unsorted.
            
            Time Complexity : O(n^2) as there are two nested loops.        
        */


        // Java class for SelectionSort

    class SelectionSort 
    { 
        void sort(int arr[],int n) 
        { 
             
      
            // One by one move boundary of unsorted subarray 
            for (int i = 0; i < n-1; i++) 
            { 
                // Find the minimum element in unsorted array 
                int min_idx = i; 
                for (int j = i+1; j < n; j++) 
                    if (arr[j] < arr[min_idx]) 
                        min_idx = j; 
      
                // Swap the found minimum element with the first 
                // element 
                int temp = arr[min_idx]; 
                arr[min_idx] = arr[i]; 
                arr[i] = temp; 
            } 
        } 
      
    } 

        /* 
            Implementation : unsorted Array : arr[n]
                            //create object
                            SelectionSort selectionSort = new SelectionSort(); 
                            //call the sort function
                            selectionSort.sort(arr,n); 
        
                              Example Output : 
                                 Given Array
                                    64 25 12 22 11 
                                 Sorted array
                                    11 12 22 25 64 
                            
        */