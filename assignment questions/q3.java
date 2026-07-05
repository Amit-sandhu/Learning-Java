// Prime Numbers in a Range Problem Statement : Accept Start and End 
// as input and print all prime numbers in the given range (inclusive).

import java.util.Scanner;

public class q3 {

    static public void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range integers 'n m' : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print("\n");
        boolean isPrime = true;
        System.out.printf("The prime numbers between %d and %d are : ", n, m);
        for (int i = n; i <= m; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (i != 1 && isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }

}
