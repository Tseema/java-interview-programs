package com.example.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeNames {

    public static String[] uniqueNames(String[] arr1, String[] arr2) {

       /* String[] combinedArr = new String[]{};*/

        //combinedArr = Arrays.stream(names1).distinct().;
        Set<String> aSet = new HashSet<>(Arrays.asList(arr1));
        Set<String> bSet = new HashSet<>(Arrays.asList(arr2));

        aSet.addAll(bSet);
        return aSet.stream().toArray(String[]::new);

        /*Stream<Integer> s1 = Arrays.stream(arr1).boxed();
        Stream<Integer> s2 = Arrays.stream(arr2).boxed();*/
       /* return Stream.concat(Arrays.stream(arr1),Arrays.stream(arr2))
                .distinct()
                .toArray(String[]::new);*/
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
