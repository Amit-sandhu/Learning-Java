import java.util.Scanner;
public class ternary {
    static public void main(String[] args){
        System.out.printf("Enter the number to check : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String isEven = (n%2 == 0) ? "Even" : "Odd";
        System.out.printf("%s\n",isEven);
        sc.close();
    }
}

// Practice: Use a ternary expression to find the largest of three
// numbers a, b, c in a single line.
