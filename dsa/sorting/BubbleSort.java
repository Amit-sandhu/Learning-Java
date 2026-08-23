package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,1,4,2,8,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // repeatedly swaps adjacent elements that are out of order
    // time complexity: O(n^2)
    static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            boolean swapped = false;
            for(int j = 0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;          // array is already sorted, stop early
            }
        }
    }
}

// Practice: Modify sort() to arrange the array in descending order
// instead of ascending.
