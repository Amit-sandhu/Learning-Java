
public class permutations {
    public static void main(String[] args){
        int[] x = {2,8,1,3};
        permutations(x);
    }
    static void permutations(int[] x){
        for(int i = 0;i<4;i++){
            for(int j = i;j<4;j++){
                System.out.printf("[%d,%d]\n",x[i],x[j]);
            }
        } 
    }
}
