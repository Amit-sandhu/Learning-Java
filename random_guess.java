import java.util.Random;
import java.util.Scanner;

public class random_guess{
    static public void main(String[] args){
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        int r = rn.nextInt(1,101);
        int n = 0;
        int g = 1;
        while(true){
            System.out.print("Enter your guess(1 to 100) : ");
            n = sc.nextInt();
            if(n<r){
                System.out.printf("Enter a bigger number\n");
                g++;
            }
            else if(n>r){
                System.out.printf("Enter a smaller number\n");
                g++;
            }
            else{
                System.out.printf("You Won! in %d guesses\n",g);
                g++;
                break;
            }
        }
        sc.close();
    }
}