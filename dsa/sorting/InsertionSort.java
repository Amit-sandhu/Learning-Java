package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {12,11,13,5,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // builds the sorted array one element at a time, shifting larger
    // elements right to make room. efficient for nearly-sorted data
    static void sort(int[] arr){
        for(int i = 1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}

// Practice: Trace through sort() on paper for {4,3,2,1} and write
// the array state after each outer loop iteration as a comment.
