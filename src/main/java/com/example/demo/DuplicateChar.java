package com.example.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicateChar {
    public static void main(String [] args){

        duplicate("this is a new try seema !!***");
    }

    public static void duplicate(String s) {

        Map<Character,Integer> values = new HashMap<Character, Integer>();
        for(int i =0 ; i< s.length();i++){
            char c = s.charAt(i);
            if(values.containsKey(c) && c != ' '){
                values.put(c,values.get(c)+1);
            }
            else {
                values.put(c, 1);
            }
        }

        if (values!= null) {
            values.forEach((k, v) -> {if(v>1) System.out.println("Key : " + k + ", Value : " + v);});
        }

    }

}
