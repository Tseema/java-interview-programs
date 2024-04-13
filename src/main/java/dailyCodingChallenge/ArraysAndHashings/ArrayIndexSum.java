package dailyCodingChallenge.ArraysAndHashings;

import java.util.HashMap;

public class ArrayIndexSum {
    public static void main(String [] args){
        int [] nums = {2,7,11,15};
       int  target = 9;
       findindexSum(nums,target);
    }

    private static int [] findindexSum(int[] nums, int target) {
        HashMap<Integer,Integer> diffval = new HashMap<>();
        for(int i =0;i<nums.length-1;i++){
            int diff = target - nums[i];
              //element  index
               //  2      0
            if(diffval.containsKey(diff)){
                return  new int[] {diffval.get(diff) ,i};

            }

            diffval.put(nums[i],i);

        }
        return new int[] {};
    }

}
