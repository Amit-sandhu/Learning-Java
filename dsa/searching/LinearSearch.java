package searching;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {4,2,7,1,9,3};
        System.out.println(search(arr, 9));
        System.out.println(search(arr, 100));
    }

    // checks each element one by one, works on unsorted data too
    // time complexity: O(n)
    static int search(int[] arr, int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}

// Practice: Modify search() to return all indices where target
// appears, instead of stopping at the first match.
