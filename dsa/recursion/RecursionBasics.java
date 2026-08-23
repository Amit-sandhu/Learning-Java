package recursion;

public class RecursionBasics {
    public static void main(String[] args){
        printCountdown(5);
        System.out.println("sum 1 to 5 = "+sumUpTo(5));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
    }

    static void printCountdown(int n){
        if(n == 0){
            System.out.println("Liftoff!");
            return;
        }
        System.out.println(n);
        printCountdown(n-1);
    }

    static int sumUpTo(int n){
        if(n == 0){
            return 0;
        }
        return n + sumUpTo(n-1);
    }

    static boolean isPalindrome(String s){
        if(s.length() <= 1){
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
        return isPalindrome(s.substring(1, s.length()-1));
    }
}

// Practice: Write a recursive method reverseString(String s) that
// returns the string reversed, without using StringBuilder.reverse().
