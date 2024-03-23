import java.util.*;
public class NextPermutation{
    public static void main(String args[]){
        int arr[]={0,1,2,5,3,3,0};
        nextPermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
        public static  void nextPermutation(int[] arr) 
    {
        int n = arr.length, i, j;
    
        // Find for the pivot element.
        // A pivot is the first element from
        // end of sequencewhich doesn't follow
        // property of non-increasing suffix
        for (i = n - 2; i >= 0; i--) {
        if (arr[i] < arr[i + 1]) {
            break;
        }
        }
    
        // Check if pivot is not found
        if (i < 0) {
        reverse(arr, 0, arr.length - 1);
        }
    
        // if pivot is found
        else {
    
        // Find for the successor of pivot in suffix
        for (j = n - 1; j > i; j--) {
            if (arr[j] > arr[i]) {
            break;
            }
        }
    
        // Swap the pivot and successor
        swap(arr, i, j);
    
        // Minimise the suffix part
        reverse(arr, i + 1, arr.length - 1);
        }
  }
 
  static void reverse(int[] arr, int start, int end)
  {
    while (start < end) {
      swap(arr, start, end);
      start++;
      end--;
    }
  }
 
  static void swap(int[] arr, int i, int j)
  {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}