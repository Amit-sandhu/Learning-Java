package hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args){
        String text = "the quick brown fox jumps over the lazy dog the fox runs";
        HashMap<String, Integer> frequency = countWords(text);

        for(Map.Entry<String, Integer> entry : frequency.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

        System.out.println(areAnagrams("listen", "silent"));
        System.out.println(areAnagrams("hello", "world"));
    }

    static HashMap<String, Integer> countWords(String text){
        HashMap<String, Integer> frequency = new HashMap<>();
        for(String word : text.split(" ")){
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }
        return frequency;
    }

    // two strings are anagrams if they contain exactly the same
    // characters with the same frequency, just rearranged
    static boolean areAnagrams(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        HashMap<Character, Integer> count = new HashMap<>();
        for(char c : a.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for(char c : b.toCharArray()){
            if(!count.containsKey(c) || count.get(c) == 0){
                return false;
            }
            count.put(c, count.get(c) - 1);
        }
        return true;
    }
}

// Practice: Use the word frequency map to find and print the single
// most frequent word in the text.
