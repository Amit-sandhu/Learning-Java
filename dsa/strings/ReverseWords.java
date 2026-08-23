package stringsdsa;

public class ReverseWords {
    public static void main(String[] args){
        System.out.println(reverseWords("the sky is blue"));
    }

    // splits on spaces, then rebuilds the sentence with words in
    // reverse order using a StringBuilder
    static String reverseWords(String s){
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for(int i = words.length-1;i>=0;i--){
            result.append(words[i]);
            if(i != 0){
                result.append(" ");
            }
        }
        return result.toString();
    }
}

// Practice: Write a method that reverses each individual word's
// letters, while keeping the word order the same.
