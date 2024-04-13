package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNbr {
    public static void main(String[] args) {

       /* HashMap&lt;Integer,String&gt; map = new HashMap&lt;Integer,String&gt;();
        map.put(2, "Saket");
        map.put(25, "Saurav");
        map.put(12, "HashMap");
        System.out.println(map.size());
        System.out.println("While Loop:");
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
        }
        System.out.println("For Loop:");
        for(Map.Entry me2: map.entrySet()) {
            System.out.println("Key is: " + me2.getKey() + " Value is: " + me2.getValue());
        }*/

        int nbr = 7 ;
        verifyPrime(nbr);

        List<Integer> arr = List.of(14,13,6);
        //Arrays.asList(2,13,6);
        Predicate<Integer> greaterthan1 = n-> n >1;
        Predicate<Integer> isprime = n-> isprime(n);
        List<Integer> collect = arr.stream().filter(greaterthan1).filter(isprime).collect(Collectors.toList());
        System.out.println(collect);
    }

    private static boolean isprime(Integer n) {
        IntPredicate intPredicate = val -> n % val != 0;
        return IntStream.range(2,n/2).allMatch(intPredicate);
    }

    private static void verifyPrime(int nbr) {
        int temp;
        boolean isprime= true;
        for(int i = 2; i<=nbr/2;i++){
             temp = nbr % i;
             if(temp==0) {
                 isprime = false;
                 break;
             }
        }
        System.out.println(isprime);
    }
}
