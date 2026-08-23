package stringsdsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;

public class AnagramGroup {
    public static void main(String[] args){
        String[] words = {"eat","tea","tan","ate","nat","bat"};

        HashMap<String, List<String>> groups = groupAnagrams(words);
        for(String key : groups.keySet()){
            System.out.println(groups.get(key));
        }
    }

    // sorting each word's letters gives a common "signature" that
    // every anagram of that word shares, making it a perfect map key
    static HashMap<String, List<String>> groupAnagrams(String[] words){
        HashMap<String, List<String>> groups = new HashMap<>();

        for(String word : words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(word);
        }
        return groups;
    }
}

// Practice: Instead of sorting each word (O(k log k) per word), use
// a 26-length character count array as the map key for an O(k) solution.
