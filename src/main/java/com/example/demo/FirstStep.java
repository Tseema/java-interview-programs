package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstStep {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,3,2,4,6,5,7,8,9);
        List<String> list2 = Arrays.asList("spring","aws!","seema","Myra","Spring boot");
        //printoddnbrs(list);
        //printlist(list2);
        //printSpring(list2);
        //print4letetr(list2);
        String s = "seema";
        int count = charcount(s);
        System.out.println(count);
    }

    private static int charcount(String s) {
        return s.split("").length;
    }

    private static void print4letetr(List<String> list2) {
        list2.stream().filter(val->val.length()==4).forEach(System.out::println);
    }

    private static void printSpring(List<String> list2) {
        //list2.stream().filter(val->val.toLowerCase().contains("spring")).forEach(System.out::println);
        list2.stream().map(list -> list.length()).forEach(System.out::println);
    }

    private static void printlist(List<String> list2) {
        list2.stream().forEach(System.out::println);
    }

    private static void printoddnbrs(List<Integer> list) {
        list.stream()
                .filter(nbr -> nbr%2 !=0)
                .forEach(System.out::println);
    }
}
