package dailyCodingChallenge.twoPointers;


public class ValidPalindrome {
    public static void main(String[] args){
        String s = "smms";
                //"A man, a plan, a canal: Panama";
        boolean val = checkpal(s);
        System.out.println(val);
    }

    public static boolean checkpal(String s) {

        char [] arr = s.toCharArray();
        int i =0,j=s.length()-1;
        while(i<j){
            char start = s.charAt(i);
            char end = s.charAt(j);

            if(!Character.isLetterOrDigit(start)){
                i++;
                continue;
            }

            if(!Character.isLetterOrDigit(end)){
                j--;
                continue;
            }

            if(Character.toLowerCase(start) != Character.toLowerCase(end)){
                return false;
            }
            i++;
            j--;
        }


        return true;
    }
}
