// Multiplication Tables Problem Statement : Write a Java program that takes an integer 
// N and prints multiplication tables from 1 to N. Each table should be printed up to 10.

import java.util.Scanner;

public class q2 {
    static public void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
