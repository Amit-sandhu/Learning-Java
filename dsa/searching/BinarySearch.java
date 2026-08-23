package searching;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,5,6,7,9,23,45,56};

        System.out.println(searchIterative(arr, 23));
        System.out.println(searchRecursive(arr, 0, arr.length-1, 45));
    }

    // requires a sorted array, repeatedly halves the search space
    // time complexity: O(log n)
    static int searchIterative(int[] arr, int target){
        int low = 0, high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }

    static int searchRecursive(int[] arr, int low, int high, int target){
        if(low > high){
            return -1;
        }
        int mid = low + (high-low)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] < target){
            return searchRecursive(arr, mid+1, high, target);
        }
        else{
            return searchRecursive(arr, low, mid-1, target);
        }
    }
}

// Practice: Modify searchIterative() to find the first occurrence of
// target in a sorted array that may contain duplicates.
