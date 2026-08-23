package stringsdsa;

public class PalindromeCheck {
    public static void main(String[] args){
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("A man a plan a canal Panama"));
    }

    // two-pointer technique: compare characters from both ends,
    // moving inward, ignoring case and non-letter characters
    static boolean isPalindrome(String s){
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = cleaned.length()-1;

        while(left < right){
            if(cleaned.charAt(left) != cleaned.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

// Practice: Write a method that finds the longest palindromic
// substring inside a larger string (e.g. "babad" -> "bab" or "aba").
