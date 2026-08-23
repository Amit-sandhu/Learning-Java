package exceptions;

public class TryCatchBasics {
    public static void main(String[] args){

        int[] arr = {1,2,3};

        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught an error: "+e.getMessage());
        }

        try{
            int x = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        }

        // a single catch block can also catch multiple exception types
        try{
            Object o = "text";
            Integer n = (Integer) o;
        }
        catch(ArithmeticException | ClassCastException e){
            System.out.println("Caught: "+e.getClass().getSimpleName());
        }

        System.out.println("Program continues normally after being caught");
    }
}

// Practice: Wrap Integer.parseInt("abc") in a try-catch and handle
// the NumberFormatException gracefully.
