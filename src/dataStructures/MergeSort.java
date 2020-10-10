package dataStructures;

/**
 * @author santhiya.s
 *
 */
class MergeSort {

// Merge two subarrays L and M into arr
void merge(int a[], int l, int m, int h) {
	
	
	   int i, j,c=l;
       int b[]=new int[h+1];
 
	for(i = l,j = m+1; i<=m && j<=h; c++)
             {
 
                  if(a[i] <= a[j])
                  b[c] = a[i++];
                 else
                 b[c] = a[j++];
      	}
	 while(i <= m )    
                 b[c++] = a[i++];
 
               while(j<=h)   
                 b[c++] = a[j++];
          
   	 for(i = l ; i <= h; i++)
                        a[i] = b[i];
   

	/*
 // Create L ← A[p..q] and M ← A[q+1..r]
 int n1 = q - p + 1;
 int n2 = r - q;

 int L[] = new int[n1];
 int M[] = new int[n2];

 for (int i = 0; i < n1; i++)
   L[i] = arr[p + i];
 for (int j = 0; j < n2; j++)
   M[j] = arr[q + 1 + j];

 // Maintain current index of sub-arrays and main array
 int i, j, k;
 i = 0;
 j = 0;
 k = p;

 // Until we reach either end of either L or M, pick larger among
 // elements L and M and place them in the correct position at A[p..r]
 while (i < n1 && j < n2) {
   if (L[i] <= M[j]) {
     arr[k] = L[i];
     i++;
   } else {
     arr[k] = M[j];
     j++;
   }
   k++;
 }

 // When we run out of elements in either L or M,
 // pick up the remaining elements and put in A[p..r]
 while (i < n1) {
   arr[k] = L[i];
   i++;
   k++;
 }

 while (j < n2) {
   arr[k] = M[j];
   j++;
   k++;
 }
	 */
}

// Divide the array into two subarrays, sort them and merge them
void mergeSort(int arr[], int l, int r) {
 if (l < r) {

   // m is the point where the array is divided into two subarrays
   int m = (l + r) / 2;

   mergeSort(arr, l, m);
   mergeSort(arr, m + 1, r);

   // Merge the sorted subarrays
   merge(arr, l, m, r);
 }
}

// Print the array
static void printArray(int arr[]) {
 int n = arr.length;
 for (int i = 0; i < n; ++i)
   System.out.print(arr[i] + " ");
 System.out.println();
}

// Driver program
public static void main(String args[]) {
	int arr[] = { 7, 6, 4, 8 };
// int arr[] = { 25, 8, 7, 4, 16, -1, 61, 0, -3, -300, 0, 2, 6, 5, 12, 10, 9, 1 };

 MergeSort ob = new MergeSort();
 ob.mergeSort(arr, 0, arr.length - 1);

 System.out.println("Sorted array:");
 printArray(arr);
}
}

