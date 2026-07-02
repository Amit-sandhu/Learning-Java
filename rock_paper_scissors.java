import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors {
    static public void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        String[] ch = { "rock", "paper", "scissors" };

        while (true) {
            int chi = rn.nextInt(1, 4);

            System.out.printf("Enter your choice 1/2/3 (rock/paper/scissors) : ");
            int plch = sc.nextInt();

            while (true) {
                if (1 > plch || plch > 3) {
                    System.out.printf("Invalid choice\n");
                    System.out.printf("Enter choice again : ");
                    int plch_ = sc.nextInt();
                    plch = plch_;
                } else {
                    break;
                }
            }

            System.out.printf("Computer chose %s\n", ch[chi - 1]);

            if (chi == plch) {
                System.out.println("You Tie!");
            } else if (plch == 1) {
                if (chi == 3)
                    System.out.println("You won!");
                else
                    System.out.println("You lose!");
            } else if (plch == 2) {
                if (chi == 1)
                    System.out.println("You won!");
                else
                    System.out.println("You lose!");
            } else {
                if (chi == 2)
                    System.out.println("You won!");
                else
                    System.out.println("You lose!");
            }

            System.out.printf("Do you want to play again? y/n : ");
            char inp = sc.next().charAt(0);
            inp = Character.toLowerCase(inp);

            if (inp != 'y') {
                break;
            }
        }

        sc.close();
    }
}