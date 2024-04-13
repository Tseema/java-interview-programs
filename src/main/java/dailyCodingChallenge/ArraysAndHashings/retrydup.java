package dailyCodingChallenge.ArraysAndHashings;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class retrydup {

    public static void main(String [] args){
        Integer [] arr = {4,7,3,6,2,9,4};
        List<String> wordsList = Arrays.asList("qqqq","wwwww","tyry","see");
        String [] words = { "see","ewrewr","dsf"};


        dup1SimpleIntArr(arr);

        dupWithList(wordsList);

        dupWithStringArr(words);
    }

    private static void dupWithStringArr(String[] words) {
        long start = System.nanoTime();
        if(words.length == Arrays.stream(words).collect(Collectors.toSet()).size()){
            System.out.println("no dup");
        }
        else
            System.out.println("has dup");

        long total = System.nanoTime() - start;
        System.out.printf("Conditional Operator Time using dupWithStringArr : %d ns, (%f sec) %n", total, total / Math.pow(10, 9));

    }

    private static void dupWithList(List<String> wordsList) {
        long start = System.nanoTime();
        if(wordsList.size() == (wordsList.stream().collect(Collectors.toSet()).size())){
            System.out.println("no dup");
        }
        else
            System.out.println("has dup");

        long total = System.nanoTime() - start;
        System.out.printf("Conditional Operator Time using dupWithList : %d ns, (%f sec) %n", total, total / Math.pow(10, 9));


    }

    private static void dup1SimpleIntArr(Integer[] arr) {
        long start = System.nanoTime();
        if(arr.length == (Arrays.stream(arr).collect(Collectors.toSet()).size())){
            System.out.println("no dup");
        }
        else
            System.out.println("has dup");

        long total = System.nanoTime() - start;
        System.out.printf("Conditional Operator Time using dup1SimpleIntArr : %d ns, (%f sec) %n", total, total / Math.pow(10, 9));

    }
}
