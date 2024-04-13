package Zalando;

import java.util.HashSet;

public class FrogJump {

    public static void main(String [] args){
        int X = 10;
        int Y = 85;
        int D = 30;
        String S;
       // canculatenbrofJumps(X,Y,D);
       // solution(5,0,2);
       S =  solution2("CBACD");

    }

    private static void canculatenbrofJumps(int x, int y, int d) {

      /*  int distance = y-x;
        int jump = distance/d;
        if(distance%d > 1)
            jump= jump+1;
        System.out.println(jump);*/
    }
    public static void solution(int AA, int AB, int BB) {
        // Implement your solution here
        StringBuilder str = new StringBuilder("AA");
        //O(N3)
        while(AA >0){
            while(BB > 0){
                str.append("BB");
                BB--;
                while(AB >0){
                    str.append("AB");
                }
                AB--;
            }
            AA--;
        }
        if(AA == 0){

        }
    }

    public static String solution2(String S) {
        // Implement your solution here
        StringBuilder transformedString = new StringBuilder(S);

       // char [] arr = S.toCharArray();
        HashSet<String> set = new HashSet<>();
        set.add("AB");
        set.add("BA");
        set.add("CD");
        set.add("CD");
        StringBuilder str = new StringBuilder(S);
        int length = str.length();
        int oldLength =0;
     /* for(int i = 0; i <=str.length();i++){
          if(set.contains(str.substring(i,i+2))){
              str.delete(i,i+2);
          }
       }
        System.out.println(str);*/


     /*   int i= str.length();
        while(i >= length ){
            i=0;
            if(set.contains(str.substring(i,i+2))){
                str.delete(i,i+2);
                length = length -2;
                oldLength = length;
            }

        }*/

        do{
            for(String sub : set){
                int pos =0;
                while(pos >=0) {
                    pos = str.indexOf(sub, pos);
                    if (pos >= 0) {
                        str.delete(pos, pos + sub.length());
                    }
                }
            }
            oldLength = length;
            length = str.length();
        }while((length > 0) && (length < oldLength));

        return str.toString();



        //return transformedString;
    }
}
