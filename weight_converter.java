import java.util.Scanner;
public class weight_converter{
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("1 for kgs to gms\n");
        System.out.printf("2 for gms to kgs\n");
        System.out.printf("3 for kgs to lbs\n");
        System.out.printf("4 for lbs to kgs\n");
        System.out.printf("Enter your option : \n");
        int opt = scanner.nextInt();
        double n;
        if(opt == 1){
            System.out.printf("Enter yout input : ");
            n = scanner.nextDouble();
            System.out.printf("%.2f Kgs in gms is %.2f",n,n*1000);
        }
        else if(opt == 2){
            System.out.printf("Enter yout input : ");
            n = scanner.nextDouble();
            System.out.printf("%.2f gms in Kgs is %.2f",n,n/1000);
        }
        else if(opt == 3){
            System.out.printf("Enter yout input : ");
            n = scanner.nextDouble();
            System.out.printf("%.2f Kgs in lbs is %.2f",n,n*2.20462);
        }
        else if(opt == 4){
            System.out.printf("Enter yout input : ");
            n = scanner.nextDouble();
            System.out.printf("%.2f Lbs in Kgs is %.2f",n,n/2.20462);
        }
        else{
            System.out.printf("Invalid Option Choosen!");
        }
        scanner.close();
    }
}
