    /*
            Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time
             Time Complexity : O(n*2)  
    */
    // Java program for implementation of Insertion Sort 
    class InsertionSort 
    { 
        /*Function to sort array using insertion sort*/
        void sort(int arr[],int n) 
        { 
            
            for (int i=1; i<n; ++i) 
            { 
                int key = arr[i]; 
                int j = i-1; 
      
                /* Move elements of arr[0..i-1], that are 
                   greater than key, to one position ahead 
                   of their current position */
                while (j>=0 && arr[j] > key) 
                { 
                    arr[j+1] = arr[j]; 
                    j = j-1; 
                } 
                arr[j+1] = key; 
            } 
        } 
      
    }
    /* 
            Implementation : unsorted Array : arr[n]
                            //create object
                            InsertionSort insertionSort = new InsertionSort(); 
                            //call the sort function
                            insertionSort.sort(arr,n); 
        
                              Example Output : 
                                 Given Array
                                    12 11 13 5 6 
                                 Sorted array
                                    5 6 11 12 13 
                                    
                            
        */