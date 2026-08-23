package inheritance;

public class Dog extends Animals {

    // properties only specified to the Dog class
    boolean isDog = true;
    String speech = "barks";

    void speak(){
        System.out.println("The dog barks *woof*");
    }
}
