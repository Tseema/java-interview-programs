package dailyCodingChallenge;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ValidIPAddress {

    public static void main(String [] args){
        String ip = "2542540123";
        validIPV4Address(ip);
    }

    private static void validIPV4Address(String ip) {
        String[] chars = ip.split("");
        //System.out.println(Arrays.stream(chars).collect(Collectors.toList()));

        List<Integer> collect = Arrays.stream(chars).map(ch -> Integer.parseInt(ch)).collect(Collectors.toList());

        LinkedList<Integer> listIP = null;
       /* for(int j=0;j<3;j++) {
            for (int i = 0; i <chars.length-j; i++) {
                String IP = chars[j]+chars[i]+"."+;
                isvalid(chars[j]+chars[i]);
            }
        }*/
    }

    private static void isvalid(String s) {

    }

}
