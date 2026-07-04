import java.util.Scanner;
import java.util.Random;

public class slot_machine {
    static public void main(String[] args) {
        String[] emojies = { "👾", "🔔", "🎃" };
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("your starting balance is $500");
        int balance = 500;
        while (true) {

            System.out.print("Enter the amount to bet with : ");
            int bet_amount = sc.nextInt();
            if (bet_amount > balance) {
                System.out.println("You don't have enough money! Re-enter bet amount");
                continue;
            }
            int a = rn.nextInt(0, 3);
            int b = rn.nextInt(0, 3);
            int c = rn.nextInt(0, 3);

            if (a == b && b == c) {
                balance += bet_amount;
                System.out.println("YOU WON !!");
            } else {
                balance -= bet_amount;
                System.out.println("you lost !");
            }
            System.out.printf("%s | %s | %s\n", emojies[a], emojies[b], emojies[c]);
            System.out.println("Remaining balance : " + balance);
            System.out.print("Do you want to play again? y/n : ");
            char playagain = sc.next().charAt(0);
            playagain = Character.toLowerCase(playagain);
            if (playagain != 'y') {
                break;
            }
            if (balance == 0) {
                System.out.println("You lost all your money!\n");
                break;
            }
        }
        sc.close();
    }
}
