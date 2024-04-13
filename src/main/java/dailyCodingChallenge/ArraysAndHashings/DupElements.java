package dailyCodingChallenge.ArraysAndHashings;

import java.io.Serializable;
import java.util.*;

public class DupElements implements Serializable {

    public static void main(String [] args){
        Integer [] nums = {1,1,1,3,3,4,3,2,4,2};
        calldup(nums);
        dupwithsets(nums);
    }




    private static boolean dupwithsets(Integer[] nums) {
        long start = System.nanoTime();
        HashSet<Integer> set =  new HashSet<Integer>(Arrays.asList(nums)); // or create set while initializing
        /* very important
        1) can create a set by coping elements of array using collections as below.
        Collections.addAll(set,nums);


        2)Using java streams as below
        Arrays.stream(nums).collect(Collectors.toCollection(HashSet::new));

        3) while intializing with array as first case
        return ((nums.length) == (new HashSet<Integer>(Arrays.asList(nums))).size())?false:true;

         */

        boolean val = (nums.length== set.size())?false:true;

        long total = System.nanoTime() - start;
        System.out.printf("Conditional Operator Time using sets : %d ns, (%f sec) %n", total, total / Math.pow(10, 9));

        return  val;
    }






    private static boolean calldup(Integer[] nums) {
        long start = System.nanoTime();
        HashMap<Integer, Integer> count = new HashMap<>();
        int val = 0;

        boolean ret = false;
        for (int i : nums
        ) {
            if (count.containsKey(i)) {
                ret = true;
                count.put(i, count.get(i) + 1);
            } else {
                count.put(i, 1);
            }
        }

        long total = System.nanoTime() - start;
        System.out.printf("Conditional Operator Time using maps : %d ns, (%f sec) %n", total, total / Math.pow(10, 9));

        return ret;
    }



}
