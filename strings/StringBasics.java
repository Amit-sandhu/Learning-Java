package strings;

public class StringBasics {
    public static void main(String[] args){
        String name = "hello world";

        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1));
        System.out.println(name.substring(6));
        System.out.println(name.substring(0,5));
        System.out.println(name.indexOf("world"));
        System.out.println(name.replace("world","java"));
        System.out.println(name.contains("hello"));
        System.out.println(name.split(" ").length);
        System.out.println(name.trim());
    }
}

// Practice: Count how many vowels appear in a given string
// using charAt() and a loop.
