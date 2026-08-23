package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {29,10,14,37,13};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // finds the minimum of the unsorted part and swaps it to the front
    // time complexity: O(n^2)
    static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

// Practice: Modify sort() to instead find the maximum each pass and
// build the sorted array from the back.
