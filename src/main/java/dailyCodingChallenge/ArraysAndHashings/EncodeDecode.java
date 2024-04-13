package dailyCodingChallenge.ArraysAndHashings;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {

    public static void main(String[] args) {
        String[] arr = new String[]{"hello", "world", "leetcode", "example"};
        String encodedStr = endcode(arr);
        List<String> arr1 = decodeStr(encodedStr);
    }

    private static List<String> decodeStr(String encodedStr) {
        List<String> arr = new ArrayList<>();

        int index = 0;
        int length = encodedStr.length() ;

        while(index < length){
            int size = encodedStr.charAt(index++);
            arr.add(encodedStr.substring(index,index+size));
            System.out.println(arr);
            index += size;
        }

        //System.out.println(arr);
        return arr;
    }

    public static String endcode(String[] arr) {
        
        StringBuilder encodedStr = new StringBuilder();

        for (String str:arr
             ) {
            encodedStr.append((char)str.length()).append(str);
        }

        System.out.println(encodedStr.toString());
        return  encodedStr.toString();
    }


}
