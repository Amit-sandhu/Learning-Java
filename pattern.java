import java.util.Scanner;
public class pattern {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter 1 for right triangle and 2 for left triangle :");
        int input;
        input = scanner.nextInt();
        if(input == 1){
            System.out.printf("Enter length of the triangle : ");
            int n;
            n = scanner.nextInt();
            for(int i = 1;i<=n;i++){
                System.out.printf("*".repeat(i)+"\n");
            }
        }
        else{
            System.out.printf("Enter length of the triangle : ");
            int n;
            n = scanner.nextInt();
            for(int i = 1;i<=n;i++){
                System.out.printf(" ".repeat(n-i)+"*".repeat(i)+"\n");
            }
        }
        scanner.close();
    }
}
