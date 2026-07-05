// Strong Numbers in a Range Problem Statement : A Strong Number is a number equal 
// to the sum of the factorials of its digits. Accept Start and End and print all 
// Strong Numbers in the range.

import java.util.Scanner;

public class q5 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your range integers 'n m' : ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        for(int i = p;i<=q;i++){
            if(isStrongNumber(i)){
                System.out.printf("%d ",i);
            }
        }
        System.out.println();
        sc.close();
    }
    static int factorial(int n){
        if(n == 1 || n==0){
            return 1;
        }
        return (n*factorial(n-1));
    }
    static boolean isStrongNumber(int m){
        int sum = 0;
        int m_ = m;
        while(m>0){
            int rem = m%10;
            sum = sum + factorial(rem);
            m = m/10;
        }
        return sum == m_;
    }
}
