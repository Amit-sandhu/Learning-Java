package exceptions;

public class FinallyDemo {
    public static void main(String[] args){
        System.out.println(divide(10,2));
        System.out.println(divide(10,0));
    }

    static int divide(int a, int b){
        try{
            return a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Error dividing "+a+" by "+b);
            return -1;
        }
        finally{
            // finally always runs, whether an exception was thrown or not,
            // and even if the try/catch block returns a value
            System.out.println("divide() attempt finished");
        }
    }
}

// Practice: Add a finally block to a method that opens a Scanner,
// and use it to always call sc.close() safely.
