package dailyCodingChallenge.ArraysAndHashings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Anagram {

    public static void main(String[] args){
        String s1 = "anagram" , s2 = "agranam";

        findIfAnagram(s1,s2);

    }

    private static boolean findIfAnagram(String s1, String s2) {
        if(s1.length() != s2.length()){
            System.out.println(" not anagram");
        }

        else {
            int NO_OF_CHARS = 26;

            // Function to check if two strings
            // are anagrams of each other

            // Create a count array and initialize
            // all values as 0
            int[] count = new int[NO_OF_CHARS];
            int i;

            char [] str1 = s1.toCharArray() , str2 = s2.toCharArray();
            // For each character in input strings,
            // increment count in the corresponding
            // count array
            for (i = 0; i < str1.length; i++) {

                count[str1[i] - 'a']++;
                count[str2[i] - 'a']--;
            }

            // If both strings are of different
            // length. Removing this condition
            // will make the program fail for
            // strings like "aaca" and "aca"
            if (str1.length != str2.length)
                return false;

            // See if there is any non-zero
            // value in count array
            for (i = 0; i < NO_OF_CHARS; i++)
                if (count[i] != 0) {
                    return false;
                }
            System.out.println(" yes anagram");
            return true;
        }
return false;

    }
}
