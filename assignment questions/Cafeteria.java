
public class Cafeteria {

    int itemId;
    String itemName;
    double price;

    static String cafeteriaName = "The Cafe";
    static double serviceCharge = 10.0;
    static int totalFoodItems = 0;

    void addFoodItem(int id, String name, double iprice) {

        // • Assign values to the instance variables.
        // • Increase totalFoodItems by 1 whenever a new food item is added.
        itemName = name;
        price = iprice;
        itemId = id;
        totalFoodItems++;
    }

    double calculateFinalPrice() {

        // • Final Price = Price + (Price × Service Charge / 100)
        double finalPrice = price + (price * serviceCharge / 100);
        return finalPrice;
    }

    void displayItemDetails() {

        // • Display Item ID, Item Name, Original Price, and Final Price.
        System.out.printf("Item ID : %d , Item Name : %s , Original Item Price : $%.2f , Final Price : $%.2f\n", itemId,itemName, price, calculateFinalPrice());
    }

    static void changeServiceCharge(double newCharge) {

        // • Update the service charge for the cafeteria.
        serviceCharge = newCharge;
    }

    static void displayCafeteriaDetails() {

        // • Display Cafeteria Name, Current Service Charge, and Total Food Items.
        System.out.println("Cafeteria Name : " + cafeteriaName +"\n");
        System.out.println("Current Service Charges are : $" + serviceCharge +"\n");
        System.out.println("Total Food Items Listed in the Cafeteria : " + totalFoodItems +"\n");
    }

    public static void main(String[] args) {

        Cafeteria item2 = new Cafeteria();
        Cafeteria item3 = new Cafeteria();
        Cafeteria item1 = new Cafeteria();

        item1.addFoodItem(101, "Veg Sandwich", 80);
        item2.addFoodItem(102, "Cold Coffee", 120);
        item3.addFoodItem(103, "Paneer Wrap", 150);

        Cafeteria.displayCafeteriaDetails();

        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();

        Cafeteria.changeServiceCharge(15);
        System.out.println("After Updating Service Charge\n");

        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();
    }
}
