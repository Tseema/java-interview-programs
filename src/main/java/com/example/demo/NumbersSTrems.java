package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumbersSTrems {


    public static void main(String[] args){
        //{1,2,3,4,5,6,7,8,9,10}
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //find average of even numbers square
        avgsqrEvennbrs(arr);

    }

    private static void avgsqrEvennbrs(List<Integer> arr) {
        System.out.println(arr.stream().filter(nbr->nbr%2==0)
                .map(e->e*e)
                        .mapToInt(e->e)
                .average()
        );
    }
}
