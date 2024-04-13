package Zalando;



public class CyclicRotation {

    public static void main(String[] args){
        int [] nbrs = {1, 2, 3, 4};
        int pos =3;
        rotateAndFindNewArray(nbrs,4);
    }

    private static void rotateAndFindNewArray(int[] nbrs ,int pos) {
        // [9, 7, 6, 3, 8]
        int [] newarr = new int[nbrs.length];
        if(pos == nbrs.length){
            for (int n:nbrs
            ) {
                System.out.println(n);
            }
            return;
        }
        for(int i =0; i< nbrs.length;i++){
            if(i+ pos < nbrs.length){
                 newarr[i + pos] = nbrs[i];
            }
            else{
                newarr[i- pos + 1] = nbrs[i];
            }
        }

        for (int n:newarr
             ) {
            System.out.println(n);
        }

    }
}
