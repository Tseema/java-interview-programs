package Zalando;

public class BinaryGap {

    public static void main(String [] args){

       /* Integer nbr = 1041;
        findMaxGap(Integer.toBinaryString(nbr));*/

        int N = 14;
        System.out.println(findMaxGap(N));
    }

    private static int findMaxGap(int N) {
        // Java code to determine Length of
// longest consecutive zeroes in the
// binary representation of a number.


                // variable to store the length of
                // longest consecutive 0's
                int maxm = -1;
                String newnbr = "";

                // to temporary store the consecutive 0's
                int cnt = 0;

                while (N != 0) {
                    if ((N & 1) == 0 ) {
                        newnbr = Integer.toBinaryString(N);
                        cnt++;
                        N >>= 1;
                        newnbr = Integer.toBinaryString(N);
                        maxm = Math.max(maxm, cnt);
                    }
                    else {

                        maxm = Math.max(maxm, cnt);
                        cnt = 0;
                        N >>= 1;
                        newnbr = Integer.toBinaryString(N);
                    }
                }
                return maxm;

        }


}
