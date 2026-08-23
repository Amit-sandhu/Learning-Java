package hashing;

import java.util.HashMap;

public class HashingBasics {
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int target = 9;

        System.out.println(java.util.Arrays.toString(twoSum(arr, target)));

        System.out.println(hasDuplicate(new int[]{1,2,3,2}));
        System.out.println(hasDuplicate(new int[]{1,2,3,4}));
    }

    // classic "two sum": using a HashMap turns an O(n^2) brute force
    // search into a single O(n) pass
    static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int complement = target - arr[i];
            if(seen.containsKey(complement)){
                return new int[]{seen.get(complement), i};
            }
            seen.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }

    static boolean hasDuplicate(int[] arr){
        HashMap<Integer, Boolean> seen = new HashMap<>();
        for(int n : arr){
            if(seen.containsKey(n)){
                return true;
            }
            seen.put(n, true);
        }
        return false;
    }
}

// Practice: Use a HashMap to find the first non-repeating character
// in a String.
