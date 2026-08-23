package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {10,7,8,9,1,5};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    // divide and conquer: pick a pivot, partition smaller/larger
    // elements around it, then recursively sort both sides
    // average time complexity: O(n log n)
    static void sort(int[] arr, int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);
            sort(arr, low, pivotIndex-1);
            sort(arr, pivotIndex+1, high);
        }
    }

    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}

// Practice: Explain in a comment why choosing the last element as the
// pivot gives worst-case O(n^2) performance on an already-sorted array.
