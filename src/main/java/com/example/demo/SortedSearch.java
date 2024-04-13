package com.example.demo;

import java.util.Arrays;
import java.util.Collections;

public class SortedSearch {

    private static void binarySearch(Integer[] ints, int key) {

        /*
        binary search using collection

         */
        long start = System.nanoTime();
        int i = Collections.binarySearch(Arrays.asList(ints), key);
        System.out.println("key found"+i);
        long total = System.nanoTime() - start;
        System.out.printf("Conditional Operator Time using Collections : %d ns, (%f sec) %n", total, total / Math.pow(10, 9));


        /*
        using traditional method
         */
        start = System.nanoTime();
        int index = Integer.MAX_VALUE;
        int low = 0 , high = ints.length-1 ;
            while (low <= high) {
                int mid = low + ((high - low) / 2);
                if (ints[mid] < key) {
                    low = mid + 1;
                } else if (ints[mid] > key) {
                    high = mid - 1;
                } else if (ints[mid] == key) {
                    index = mid;
                    break;
                }
            }
        System.out.println("key found"+index);
        total = System.nanoTime() - start;
        System.out.printf("Conditional Operator Time using Traditional Method : %d ns, (%f sec) %n", total, total / Math.pow(10, 9));

    }

    public static int binarySearchRecursive(Integer[] arr,int first,int last,int key){
        /*
        Whether to use a recursive or an iterative approach for writing the algorithm is mostly a matter of personal preference. But still here are a few points we should be aware of:

        1. Recursion can be slower due to the overhead of maintaining a stack and usually takes up more memory
        2. Recursion is not stack-friendly. It may cause StackOverflowException when processing big data sets
        3. Recursion adds clarity to the code as it makes it shorter in comparison to the iterative approach

        Ideally, a binary search will perform less number of comparisons in contrast to a linear search for large values of n. For smaller values of n, the linear search could perform better than a binary search.

        One should know that this analysis is theoretical and might vary depending on the context.

        Also, the binary search algorithm needs a sorted data set which has its costs too. If we use a merge sort algorithm for sorting the data, an additional complexity of n log n is added to our code.
         */

        long start = System.nanoTime();
        int index = Arrays.binarySearch(arr, key);
        System.out.println("key found"+index);
        long total = System.nanoTime() - start;
        System.out.printf("Conditional Operator Time using Arrays binary search : %d ns, (%f sec) %n", total, total / Math.pow(10, 9));

        return index;
       /* int  mid = (first + (last-first))/2;


        if (last < first) {
            return -1;
        }

        if(key == arr[mid]){
          return mid;
        }
            else if (arr[mid] < key) {
                return binarySearchRecursive(arr, first, mid - 1, key);
            }
            else  {
                return binarySearchRecursive(arr, mid + 1, last, key);
            }


*/
    }

    public static void main(String[] args) {
        //System.out.println(SortedSearch.countNumbers(new Integer[] { 1, 3, 5, 7,9,12,18,20,34,40 }, 14));
        Integer[] arr = new Integer[] { 1, 3, 5, 7,9,12,18,20,34,40};
        binarySearch(arr,5);
        binarySearchRecursive(arr,0,(arr.length -1),5);
    }



}

 /* public static int countNumbers(Integer[] sortedArray, int lessThan) {

        int first = 0 , last = sortedArray.length-1 , mid = (first+last)/2 ,count =0;

        while(first <= last){
            if(sortedArray[mid] < lessThan && sortedArray[mid+1] > lessThan){
                count ++;
                last = mid-1;
            }
            else if (sortedArray[mid]== lessThan){
                count = mid-1;
                break;
            }
            else if(sortedArray[mid] < lessThan) {
                first = mid + 1;
                count++;
            }


            mid = (first+last)/2;
        }

        if(sortedArray[mid] < lessThan){
            count = count + mid-1;
        }


        return count;

    }
    */
