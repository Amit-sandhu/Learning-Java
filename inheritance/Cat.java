package inheritance;

public class Cat extends Animals {

    // properties only specified to the Dog class
    boolean isCat = true;
    String speech = "meows";

    void speak(){
        System.out.println("The cat meows *meow*");
    }
}
