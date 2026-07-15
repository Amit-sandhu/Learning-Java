
public class q {
    public static void main(String[] args){
        int sum = 0;
        int[][] arr = {{1,4,3},{9,-8,6},{2,7,9}};
        for(int i = 0;i<arr.length;i++){
            int j = i;
            sum += arr[i][j];
            sum -= arr[i][arr.length-1-i];
        }
        if(sum<=0){
            System.out.println(sum*(-1));
        }
        else{
            System.out.println(sum);
        }
    }
}
