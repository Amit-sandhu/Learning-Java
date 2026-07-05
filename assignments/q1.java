
//Even or Odd Numbers Problem Statement : Write a Java program that accepts an integer N 
//and prints all numbers from 1 to N. For each number, print whether it is Even or Odd.

import java.util.Scanner;

public class q1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer n : \n");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            if(i%2 == 0){
                System.out.printf("%d -> Even\n",i);
            }
            else{
                System.out.printf("%d -> Odd\n",i);
            }
        }

        sc.close();
    }
}
