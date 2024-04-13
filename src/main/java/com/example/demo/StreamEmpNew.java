package com.example.demo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamEmpNew {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("anil", 1000);
        map1.put("bhavna", 1300);
        map1.put("micael", 1500);
        map1.put("tom", 1600);//output
        map1.put("ankit", 1200);
        map1.put("daniel", 1700);
        map1.put("james", 1400);

        findNthempSalary(map1,3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("anil", 1000);
        map2.put("ankit", 1200);
        map2.put("bhavna", 1200);
        map2.put("james", 1200);
        map2.put("micael", 1000);
        map2.put("tom", 1300);
        map2.put("daniel", 1300);

        findNthempSalary1(map2,2);

        Map<String, String> books = new HashMap<>();
        books.put(
                "978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put(
                "978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");

        //callnow(books);


    }

    private static void callnow(Map<String, String> books) {

        System.out.println(books.entrySet().stream().filter(e->"Effective Java".equalsIgnoreCase(e.getValue()))
                .collect(Collectors.toList()));

        System.out.println(books.entrySet().stream().filter(e->"Effective Java".equalsIgnoreCase(e.getValue()))
                .map(Map.Entry::getKey)
                .findFirst());
    }

    private static void findNthempSalary1(Map<String, Integer> map1, int i) {
        map1.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey,Collectors.toList())))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(i-1);


        System.out.println(map1.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,
                Collectors.toList())) );

        System.out.println(map1.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,
                Collectors.mapping(Map.Entry::getKey,Collectors.toList()))) );

        System.out.println(map1.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,
                Collectors.mapping(Map.Entry::getKey,Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(i-1));

    }

    private static void findNthempSalary(Map<String, Integer> map1, int i) {
        Map.Entry<String, Integer> stringIntegerEntry = map1.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList()).get(i - 1);

        System.out.println(stringIntegerEntry);
    }


}
