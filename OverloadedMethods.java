public class OverloadedMethods {

    public static void main(String[] args) {
        System.out.println(add(2, 3)); // Arguments: values passed while calling a method.
    }

    // Parameters: variables that receive values (arguments) passed to the method.
    public static int add(int a, int b) {
        return a + b;
    }

    // Same method name, different number of parameters.
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}

/*
METHOD OVERLOADING

- Method overloading means having multiple methods with the same name
  in the same class but with different parameter lists.

- The parameter list can differ by:
    1. Number of parameters
    2. Type of parameters
    3. Order of parameter types

Examples:
    add(int a, int b)
    add(int a, int b, int c)      // Different number
    add(double a, double b)       // Different types
    add(String s, int x)          // Different order from add(int x, String s)

METHOD SIGNATURE

- A method signature consists of:
    Method Name + Parameter List

- The parameter list includes:
    • Number of parameters
    • Data types of parameters
    • Order of parameters

- The return type is NOT part of the method signature.

Examples:
    add(int, int)
    add(int, int, int)
These have different signatures, so they can coexist.

********* INVALID OVERLOADING ********* 

Changing only the return type does NOT create a new signature.

Example:
    int add(int a, int b)
    double add(int a, int b)   // Compile-time error

NAMING CONVENTION

- Class names -> PascalCase (OverloadedMethods)
- Method names -> camelCase (add)
- Variable names -> camelCase (firstNumber)
*/