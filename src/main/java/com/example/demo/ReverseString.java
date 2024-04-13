package com.example.demo;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args){
        String org= "make it backwards";
        reverse(org);
        revSentence(org);
        wordRevrse(org);
        reverseStream(org);
        cahrcount(org);
        dupelem(org);
        nonrepitativeelm(org);
        reversetry(org);
    }

    private static void reversetry(String org) {
        
    }

    private static void nonrepitativeelm(String org) {


        Map.Entry<String, Long> stringLongEntry = Stream.of(org.split("")).filter(c -> !c.isBlank()).
                collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(key -> key.getValue() == 1).findFirst().get();
        System.out.println(stringLongEntry);
        System.out.println("");
    }

    private static void dupelem(String org) {
        Map<String, Long> collect = Stream.of(org.split("")).filter(c-> !c.isBlank())
                .collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
               /* .forEach((k,v)->{
                    if(v>1){
                        System.out.println(k);
                    }
                });*/


         System.out.println(collect.entrySet().stream().filter(key->key.getValue()>1).map(Map.Entry::getKey)
                 .collect(Collectors.toList())
        );
        System.out.println("");

    }

    private static void cahrcount(String org) {
        String [] arr = org.split("");

            //System.out.print(Arrays.toString(arr));

        Map<String, Long> collect = Arrays.stream(org.split("")).filter(c-> !c.isBlank())
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(collect);
        System.out.println("");


    }

    private static void reverseStream(String org) {

        System.out.println("-----------------------");
        //System.out.println(org.chars().mapToObj(c->(char)c).toArray().length);
        /*org.chars().mapToObj(c->(char)c).forEach(System.out::print);
        System.out.println("-----------------------");*/


       /*char[] arr = org.toCharArray();
        IntStream.range(0,arr.length)
                .mapToObj(i -> arr[(arr.length-1)-i])
                .forEach(System.out::print);
        System.out.println("-----------------------");

       System.out.println(org.chars()
               .mapToObj(c->(char)c)
               .reduce("",(a,b)->b+a,(a2, b2) -> b2 + a2));*/

        Comparator<Character> comparator = (c1,c2)->c2.compareTo(c1) ;
        org.chars().mapToObj(c->(char)c).sorted(comparator).forEach(System.out::print);

        /*List<Integer> nbrs = List.of(1,2,3,4,5,6,7,8,9);
        nbrs.stream().filter(nbr->nbr%2==0).forEach(System.out::println);*/



        //org.chars().mapToObj(c -> (char)c).sorted().forEach(System.out::println);
    }

    private static void revSentence(String org) {
        String rev = new StringBuilder(org).reverse().toString();
        System.out.println(rev);
    }

    private static void wordRevrse(String org){
        StringBuilder temp = new StringBuilder();
        String[] arr = org.split(" ");
        for(int i = arr.length-1; i >=0 ;i--){
            temp.append(arr[i]).append(" ");
        }
        System.out.println(temp);

    }


    private static void reverse(String org) {
        char[] ch = org.toCharArray();
        String rev = "";
        for(int i = ch.length -1; i>=0; i--){
            rev = rev + ch[i];
        }
        System.out.println(rev);
    }

}
