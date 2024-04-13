package Zalando;

import java.util.Arrays;
import java.util.HashMap;

public class OddOccurrencesInArray {

    public static void main(String [] args){
        int [] arr = {9,3,9,3,9,7,7};
        findnonrecurringElem(arr);
    }

    private static void findnonrecurringElem(int[] arr) {

        HashMap<Integer,Integer> val = new HashMap<>();
        for (int n :arr
             ) {
            if(val.containsKey(n)){
                val.remove(n);
            }
            else{
                val.put(n,1);
            }
        }

        System.out.println(val.keySet());

    }
}
