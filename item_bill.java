import java.util.Scanner;
public class item_bill {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the item to buy : (pizza , burger , coke)");
        String item_name = scanner.nextLine();
        System.out.println("Enter the quantity : ");
        int quantity = scanner.nextInt();
        if (item_name.equals("pizza")) {
            System.out.println("The total bill is : $" + (5 * quantity));
        } else if (item_name.equals("burger")) {
            System.out.println("Total: $" + (3 * quantity));
        } else if (item_name.equals("coke")) {
            System.out.println("Total: $" + (2 * quantity));
        } else {
            System.out.println("Invalid item");
        }
        scanner.close();
    }
}
