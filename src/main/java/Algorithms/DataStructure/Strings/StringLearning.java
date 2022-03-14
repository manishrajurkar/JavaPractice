package Algorithms.DataStructure.Strings;

import java.util.HashMap;
import java.util.Map;

public class StringLearning {

    public static void main(String[] args) {
        String str  = "geeksforgeeks";
        String str2 = "geeksforgeeks";
        //transformString(str);
        //stringCharSequence(str2);
        //stringComparable(str,str2);
        //stringStringMethods(str,str2);
        countFrequency(str);
    }

    public static void stringCharSequence(String str){
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.subSequence(1,4));
        System.out.println(str.substring(1));
        System.out.println(str.substring(1,4));
        //System.out.println(str.toString());  //check use in this program
        //System.out.println(str.chars());
        System.out.println(str.substring(1,4));

    }
    public static void stringComparable(String str, String str2){
        System.out.println(str.compareTo(str2));
        if (str.compareTo(str2)== 0) {
            System.out.println("String are same");
        } else if (str.compareTo(str2)>0){
            System.out.println("first string is bigger");
        } else if (str.compareTo(str2)<0){
            System.out.println("second string is bigger");
        }else{
            System.out.println("something is wrong");
        }
    }

    public static void stringStringMethods(String str,String str2){
        System.out.println(str.replace(str.charAt(0),'a'));
        System.out.println();

    }

    public static void countFrequency(String str){
        str.replace(" ","");
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        char arr [] = str.toCharArray();
        for(char c: arr) {
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);

    }




    public static void transformString(String str){
        System.out.println("-----------------OUTPUT-----------------");
        System.out.println(str.length());
        for (int i=0; i<str.length();i++) {
            for (int j = 0; j < str.length()-1; j++) {
                System.out.println(str.charAt(i));
                if (str.charAt(j)== str.charAt(j)){
                    System.out.println("duplicate found" +i +"&&"+j);
                }
            }
        }

    }
}
