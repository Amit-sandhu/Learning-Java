package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Reverse {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        int[] arrReverse = new int[arr.length];
        int j = 0;
        for(int i = 4;i>=0;i--){
            arrReverse[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arrReverse));
        sc.close();
    }
}
