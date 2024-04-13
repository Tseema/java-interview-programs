package com.example.demo;

import org.springframework.util.comparator.Comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams2 {

    public static void main(String[] args){
        int [] nbrs= {5,9,11,2,8,21,1};
        secondHighestNbr(nbrs);
        elementsStratwith(nbrs);

        String[] arr = {"spring","Streamsjava","momDad","test"};
        longestString(arr);

    }

    private static void elementsStratwith(int[] nbrs) {
        System.out.println(Arrays.stream(nbrs).boxed().map(s->s.toString()).
                filter(s->s.startsWith("1")).collect(Collectors.toList()));
    }

    private static void longestString(String[] arr) {
        System.out.println(Arrays.stream(arr).reduce((word1,word2)-> word1.length()>word2.length()?word1:word2)
                .get());
    }

    private static void secondHighestNbr(int[] nbrs) {
        System.out.println(Arrays.stream(nbrs).boxed().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get());
    }
}
