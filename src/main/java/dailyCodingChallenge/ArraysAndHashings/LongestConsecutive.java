package dailyCodingChallenge.ArraysAndHashings;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args){
        Integer [] nums = {100,4,200,1,3,2};
        int length = findLongestConsecutive(nums);
    }

    private static int findLongestConsecutive(Integer[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>(Arrays.asList(nums));

        int longest =1;
        for (int num:nums
             ) {
            //check if this is the first element
            if(!hs.contains(num-1)){
                int count = 1;
                while(hs.contains(num+1)){ // check next nbr
                    num ++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
            if(longest > nums.length/2) break;
        }

        return longest;
    }
}
