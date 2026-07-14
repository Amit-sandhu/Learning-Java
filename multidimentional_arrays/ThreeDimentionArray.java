package multidimentional_arrays;

public class ThreeDimentionArray {
    public static void main(String[] args){
        int sum = 0;
        int[][][] arr = {{{1,2,3,4,5}},{{6,7,8,9,10}}};
        for(int i = 0, j = 0, k = 0; i<arr.length && j<arr[0].length && k<arr[0][0].length ;i++ , j++ , k++){
            sum += arr[i][j][k];;
        }
        System.out.println(sum);
    }
}
