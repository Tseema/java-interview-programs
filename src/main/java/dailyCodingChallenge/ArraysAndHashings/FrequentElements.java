package dailyCodingChallenge.ArraysAndHashings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FrequentElements {
    public  static  void main(String[] args){
        int [] nums = {1,1,1,2,2,3};
       int  k = 2;
      findFreqOfk(nums,k);
    }

    private static int [] findFreqOfk(int[] nums, int k) {

        long start1 = System.nanoTime();
        int[] ints = Arrays.stream(nums).boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() >= k)
                .map(Map.Entry::getKey)
                .mapToInt(x -> x).toArray();
        long total1 = System.nanoTime() - start1;
        System.out.printf("Conditional Operator Time using Collections : %d ns, (%f sec) %n", total1, total1 / Math.pow(10, 9));

        System.out.println("check  " + ints); // takes 10s


        // takes 4s
        long start = System.nanoTime();
        HashMap<Integer,Integer> mapper = new HashMap<>();
        for (Integer i :nums
        ) {
            if(!mapper.containsKey(i)){
                mapper.put(i,1);
            }
            else {
                mapper.replace(i, mapper.get(i) + 1);
            }
        }


        IntStream intStream = mapper.entrySet().stream()
                .filter(e -> e.getValue() >= k)
                .map(s -> s.getKey())
                .mapToInt(x -> x);



        long total = System.nanoTime() - start;
        System.out.printf("Conditional Operator Time using Collections : %d ns, (%f sec) %n", total, total / Math.pow(10, 9));


        return ints;
    }
}
