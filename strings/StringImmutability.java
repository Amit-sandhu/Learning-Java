package strings;

public class StringImmutability {
    public static void main(String[] args){
        String a = "java";
        String b = a;
        a = a + " rocks";

        System.out.println(a);
        System.out.println(b);

        // a and b pointed to the same object initially, but a = a + "..."
        // creates a brand new String object instead of modifying the old one.
        // b still points to the original "java" object because Strings
        // in Java are immutable - once created, their content can never change.

        String x = "java";
        String y = "java";
        System.out.println(x == y);          // true, both point to the same pooled literal

        String p = new String("java");
        System.out.println(x == p);           // false, p is a new object on the heap
        System.out.println(x.equals(p));       // true, content is equal
    }
}

// Practice: Explain in a comment why using == to compare Strings is
// risky, and why .equals() should be used instead.
