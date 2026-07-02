import java.util.Scanner;

public class compound_interest {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p;
        double r;
        double t;
        System.out.printf("Enter the principal amount : ");
        p = scanner.nextDouble();
        System.out.printf("Enter the rate per annum : ");
        r = scanner.nextDouble();
        System.out.printf("Enter the time in years : ");
        t = scanner.nextDouble();

        double ci = p*(Math.pow(1+(r/100),t));
        System.out.printf("The Compound Interest is : $%,.2f\n",ci);
        System.out.printf("The Total Amount is : $%,.2f\n",ci+p);
        scanner.close();
    }
}