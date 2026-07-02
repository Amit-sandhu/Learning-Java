import java.util.Scanner;

public class if_else {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week : ");
        String day = sc.nextLine().toLowerCase();
        if(day.equals("monday") || day.equals("wednesday") || day.equals("saturday")){
            System.out.println("Wear Red Tshirt Today!");
        }
        else{
            System.out.println("Wear Black Tshirt Today!");
        }
        sc.close();
    }
}
