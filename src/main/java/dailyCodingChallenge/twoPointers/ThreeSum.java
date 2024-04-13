package dailyCodingChallenge.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args){
                Integer [] nums = {-1,0,1,2,-1,-4};
                findtriplets(nums);
    }

    private static void findtriplets(Integer[] nums) {

        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length;i++){
            int start = i+1;
            int end = nums.length-1;

            if(i >0 && nums[i]==nums[i-1]){
                continue;
            }

            while(start<end){

                 if(end < nums.length-1 && nums[end]==nums[end+1]){
                     end--;
                     continue;
                 }

                 if(nums[i]+nums[start]+nums[end]==0){
                     triplets.add(Arrays.asList(nums[i],nums[start],nums[end]));
                     start++;
                     end--;
                 }
                 else if(nums[i]+nums[start]+nums[end] < 0){
                     start++;
                 }
                 else if (nums[i]+nums[start]+nums[end] >0){
                     end--;
                 }

            }

        }
        System.out.println(triplets);
    }
}
