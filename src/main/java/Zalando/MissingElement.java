package Zalando;

import java.util.Arrays;
import java.util.HashMap;

public class MissingElement {
    public static void main(String [] args){
        int[] A = {2,3,1,5};
       int b =  findMissingElement(A);

    }

    private static int findMissingElement(int[] values) {

      /*  if (values.length == 0) return 0;

        int result = 0;
        for (int i = 1; i <= values.length + 1; i++) {
            result ^= i;
            System.out.print(result + "    ");
        }

        System.out.println();

        for (int i = 0; i < values.length; i++){
            result ^= values[i];

            System.out.print(result + "    ");
        }

        System.out.println(result);
        return result;*/
        int n = values.length + 1;
        int sumOfAllElements = (n * (1 + n)) / 2;
        int missingElement = sumOfAllElements - Arrays.stream(values).sum();
        System.out.println(missingElement);
        return missingElement;
    }
}
