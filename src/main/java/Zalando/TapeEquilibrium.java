package Zalando;

public class TapeEquilibrium {
    public static void main(String [] args){
        int[] A = {3,1,2,4,3};
        int b =  findMinDiff(A);

    }

    private static int findMinDiff(int[] a) {
        int diff =0 , min = 10000 ;
        int sum1 = 0, sum2 = 0;
        for(int i =0 ; i < a.length;i++){
           sum1 +=a[i];
        }

        for(int i =0 ; i < a.length;i++){
            diff = sum1 - a[i] ;
            min = Math.min(Math.abs(diff - a[i]),min) ;
        }

        System.out.println(min);
        return min;
    }
}
