package com.example.demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class swapString {

    public static void main(String[] args){
        String s1 = "seemam";
        String s2 = "work";
        swapstrings(s1,s2);
        countchar(s1);
        dupchar(s1);
        dupchar1(s1);

        int first = 22;
        int second = 34;
        swapnbrs(first,second);

        List<String> list = Arrays.asList("work","smart","work","hard");
        dupeleminarray(list);
        sortarray(list);
    }

    private static void sortarray(List<String> list) {
        System.out.println("");
                //list.stream().collect(Collectors.toList(),Comparator.comparing((a,b)-> (a > b?a:b));
        List < String > sortedList1 = list.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(sortedList1);
        System.out.println("");
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        System.out.println("");
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }

    private static void dupeleminarray(List<String> list) {

        System.out.println(list.stream().collect(Collectors
                .groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue()>1).collect(Collectors.toList())
        );
    }

    private static void dupchar1(String s1) {
        Map<Character, Long> collect = s1.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect.entrySet().stream().filter(key->key.getValue()>1).collect(Collectors.toList()));
    }

    private static void dupchar(String s1) {
        Map<Character,Integer> countval = new HashMap<>();
        char[] arr = s1.toCharArray();
        for (char ch:arr
             ) {
            if(countval.containsKey(ch))
            {
                countval.put(ch,countval.get(ch)+1);
            }
            else
                countval.put(ch,1);
        }

        countval.forEach((key,val)-> {
            if(val>1){
                System.out.println("key : "+ key + "  val :  "+ val);
            }
        });
       /* System.out.println(s1.chars().mapToObj(c->(char)c)
                .map(Comparator.comparing((a,b)-> ?true:false))
        );*/
    }

    private static void countchar(String s1) {
        Map<Character ,Integer> stringIntegerMap = new HashMap<>();
        char[] arr = s1.toCharArray();
       /* for(int i = 0; i<arr.length;i++){
            char c = arr[i];
            if(stringIntegerMap.containsKey(c)){
                stringIntegerMap.put(c,stringIntegerMap.get(c)+1);
            }
            else{
                stringIntegerMap.put(c,1);
            }
        }

        System.out.println(stringIntegerMap);*/
/*
        for (char c:arr
             ) {
            if(stringIntegerMap.containsKey(c)){
                stringIntegerMap.put(c,stringIntegerMap.get(c)+1);
            }
            else{
                stringIntegerMap.put(c,1);
            }

        }
        System.out.println(stringIntegerMap);*/

        /*while(arr.length>0){
            int i = 0;
            char c = arr[i];
            if(stringIntegerMap.containsKey(c)){
                stringIntegerMap.put(c,stringIntegerMap.get(c)+1);
            }
            else{
                stringIntegerMap.put(c,1);
            }
            i++;
        }
        System.out.println("seema count of each char :" + stringIntegerMap);*/
    }

    private static void swapnbrs(int first, int second) {
       /* int temp ;
        temp = first;
        first = second;
        second = temp;*/

        first = first+second;
        second = first - second;
        first = first-second;
        System.out.println("first : "+ first +" second : " + second);
    }

    private static void swapstrings(String s1, String s2) {
        int lenS1 = s1.length();
        s1 = s1+s2;
        s2 = s1.substring(0,lenS1);
        s1 = s1.substring(lenS1,s1.length());
        System.out.println("new swaped values s1:"+s1+" and s2:"+s2);

    }
}
