public class overloadedMethods {

    public static void main(String[] args) {
        System.out.println(add(2, 3)); // Arguments: values passed while calling a method.
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}