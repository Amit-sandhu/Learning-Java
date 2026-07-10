package dsa;

import java.util.Arrays;

public class ArrayIn3Integers {
    public static void main(String[] args){

        int[] arr_ = {0,1,2,2,1,0,1,1};
        int[] arr = new int[arr_.length];
        int i,j =0,k =arr.length-1;
        for(i = 0;i<arr_.length;i++){
            if(arr_[i] == 0){
                arr[j] = 0;
                j++;
            }
            if(arr_[i] == 2){
                arr[k] = 2;
                k--;
            }
        }
        for(int x = j;x<=k;x++){
            arr[x] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
