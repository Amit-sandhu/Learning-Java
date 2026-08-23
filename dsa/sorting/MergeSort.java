package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr = {38,27,43,3,9,82,10};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    // divide and conquer: split into halves, sort each half, then merge
    // time complexity: O(n log n)
    static void sort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        int mid = left + (right-left)/2;
        sort(arr, left, mid);
        sort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right){
        int[] leftArr = Arrays.copyOfRange(arr, left, mid+1);
        int[] rightArr = Arrays.copyOfRange(arr, mid+1, right+1);

        int i = 0, j = 0, k = left;
        while(i < leftArr.length && j < rightArr.length){
            if(leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            }
            else{
                arr[k++] = rightArr[j++];
            }
        }
        while(i < leftArr.length){
            arr[k++] = leftArr[i++];
        }
        while(j < rightArr.length){
            arr[k++] = rightArr[j++];
        }
    }
}

// Practice: Count how many merge operations swap an element from
// rightArr before an element from leftArr - this count is the number
// of "inversions" in the array.
