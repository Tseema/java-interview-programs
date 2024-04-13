package Zalando;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingElementNonSorted {
    public static void main(String [] args){
        int[] A = {-1,-3};
        int b =  findMissingElement(1);
        //System.out.println(b);

    }

    private static int findMissingElement(int N) {
        //54321

        int enable_print = N % 10;
        int newnbr =0;
        while (N > 0) {

            if (N%10 != 0 ) {
                enable_print = 1;
            }
            if (enable_print == 1  ) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }



       /* int N = A.length;
        int[] hashed = new int[N];

        for( int i: A){
            if(i>0 && i<=N){
                hashed[i-1] = 1;
                System.out.print(hashed[i] + " ");
            }
        }

        System.out.println(" ");
        for(int i = 0; i<N; i++){
            System.out.print(hashed[i] + " ");
            if(hashed[i]==0){
                return i+1;
            }
        }
        return N+1;*/
        return 1;
    }

}



    /*int N = A.length, res = 1;
boolean found = false;
Set<Integer> set = new HashSet<>();
for (int a : A) {
    if (a > 0) {     	        set.add(a);     	    }
}     	for (int i = 1; i <= N + 1 && !found; i++)
{     	    if (!set.contains(i))
    {     	        res = i;     	        found = true;     	    }
}         return res;*/
