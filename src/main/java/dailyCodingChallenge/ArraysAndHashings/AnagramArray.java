package dailyCodingChallenge.ArraysAndHashings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramArray {
    public static void main(String[] args){
        List<List<String>> result;
        List<String> strs = Arrays.asList("eat","tea","tan","ate","nat","bat");
        result = getAnagramList(strs);
        System.out.println(result);
    }

    private static List<List<String>> getAnagramList(List<String> strs) {
        HashMap<String,List<String>> anagram = new HashMap<>();

        for (String word:strs
             ) {
            char [] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!anagram.containsKey(sortedWord)){
                anagram.put(sortedWord,new ArrayList<String>());
            }

            anagram.get(sortedWord).add(word);
        }

        return new ArrayList<>(anagram.values());
    }

}
