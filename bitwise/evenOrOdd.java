package bitwise;

public class evenOrOdd {
    public static void main(String[] args){
        int x = 4;
        int y = x&1;
        if(y == 1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
}
