package com.example.demo;

public class palindrome {
    public static void main(String[] args){
       boolean val =  palindromeverify("seema");
               //checkpalindrome("seema");


        boolean val1 = palindromeverify1(1214);
       if (val1){
           System.out.println("is palindrome");
       }
       else{
           System.out.println("isnt one ");
       }

        int num, a = 0,b=0, c =1;
        for (int i=0; i<8; i++) {
            a = b;
            b = c;
            c = a+b;
            System.out.println(a + "");    //if you want to print on the same line, use print()
        }

    }

    private static boolean palindromeverify1(int n) {

        int temp = n , sum =0,r;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum){
            return true;
        }
        else
            return false;

    }

    private static boolean palindromeverify(String str) {
        String str1 = new StringBuilder(str).reverse().toString();
        return str1.equals(str);
    }

    private static boolean checkpalindrome(String s) {
        String rev = "";
        boolean valid = false;
        //char[] pal = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
            System.out.println(rev);
        }

        if (rev.equals(s)) {
            valid = true;
        }
        return valid;
    }


}
