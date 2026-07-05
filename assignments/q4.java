// Number Guessing Game Problem Statement : The secret number is 27. 
// The user has 5 attempts to guess it. Print Too Low, 
// Too High, or Congratulations accordingly. If not guessed 
// within five attempts, print Better Luck Next Time!

import java.util.Random;
import java.util.Scanner;

public class q4 {
    static public void main(String[] args){
        int n = 27;
        int guess = 1;
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        n = rn.nextInt(1,101);
        while(true){
            System.out.print("Enter your guess : ");
            int m = sc.nextInt();
            if(n == m){
                System.out.println("Congratulations! You guessed the secret number");
                break;
            }
            else if(m<n){
                System.out.println("Too low");
                guess+=1;
            }
            else if(m>n){
                System.out.println("Too high");
                guess+=1;
            }
            if(guess > 5){
                System.out.printf("Better Luck Next Time! The number was %d\n",n);
                break;
            }
        }
        sc.close();
    }
}
