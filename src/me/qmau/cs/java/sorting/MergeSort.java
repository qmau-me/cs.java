		
		/**
			Merge Sort is a Divide and Conquer algorithm.
			It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves.
			
			Time Complexity : nLogn in all 3 cases (worst, average and best)		
		*/

		// JAVA class for MergeSort

	class MergeSort{

		//Merges two subarrays of arrays of arr[]
		void merge(int arr[],int low,int mid,int high){
		  //intial indexes of two sub arrays to be merged
		    int i=low,j=mid+1;
		    //create a temp array to store sorted elements  
		    int temp[] = new int [(high-low)+1];
		    //index for the temp array
		    int k=0;
		    //comapare's elements of both subarrays 
		    //append's elements to the temp[] in sorted order 
		    while(i<=mid&&j<=high){
					if(arr[i] < arr[j])
					    temp[k++]=arr[i++];
					else
					    temp[k++]=arr[j++];
			}

		    //append remaing elements if any
		    while(i<=mid){
				temp[k++]=arr[i++];
		    }
		    //append remaing elements if any
		    while(j<=high){
				temp[k++]=arr[j++];
		    }
		    //copy sorted elements to the orginal array which will be in sorted
		    k=0;
		    for(int p=low;p<=high;p++){
				arr[p]=temp[k++];
		    }
		}

		//sort() divides  arr[] into equal halves and merge them using merge() 
		void sort(int arr[],int low,int high){
		    //if there is only one element in array then no need of sorting 
		    if(low==high)
				return;
		    	//find middle point to divide the array[]
		    	int mid = (low+high)/2;
		    	//sort first half
		    	sort(arr,low,mid);
		    	//sort second half
		    	sort(arr,mid+1,high);
		    	//merged the sorted halves
		    	merge(arr,low,mid,high);
		}

	}
		
		/* 
			Implementation : unsorted Array : arr[n]
							//create object
							MergeSort mergeSort = new MergeSort(); 
	        				//call the sort function
	        				mergeSort.sort(arr, 0, n-1); 
	  	
						      Example Output : 
						    	Given Array
									12 11 13 5 6 7 
								Sorted array
									5 6 7 11 12 13
							
		*/

