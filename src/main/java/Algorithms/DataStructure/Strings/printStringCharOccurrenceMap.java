package Algorithms.DataStructure.Strings;

import java.util.HashMap;
import java.util.Map;
/*
https://www.youtube.com/watch?v=3mz_3UBlK0c&ab_channel=NaveenAutomationLabs
 */
public class printStringCharOccurrenceMap {

    public static void main(String [] args){
       String value= countNumberChar("geek Sss");
        System.out.println(value);

    }
    public static String countNumberChar(String str){

        if (str.length()==0){
            return " ";
        }
        else if(str.length()>0) {
            str.replace(" ", "");
            //str.toLowerCase();
            //str.trim();
           // return str;
        }

        Map<Character,Integer> map = new HashMap<Character,Integer>();
        char[] charString = str.toCharArray();

        for (char c : charString){

            if (map.containsKey(c)){
                map.replace(c,map.get(c)+1);
            }
            else map.put(c,1);
        }
        return map.toString();
    }

}
