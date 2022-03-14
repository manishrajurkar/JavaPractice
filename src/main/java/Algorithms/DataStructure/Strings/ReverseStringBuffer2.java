package Algorithms.DataStructure.Strings;

public class ReverseStringBuffer2 {

    public static void main(String [] args){
        reverseString("Hello");
    }
    public static void  reverseString(String name){
        StringBuilder sb = new StringBuilder(name);

        for (int i=0; i<name.length()/2;i++){
            int start = i;
            int end = name.length()-1-i;

            char startChar = name.charAt(i);
            char endChar = name.charAt(end);

            if (start<end){
                //char temp = sb.charAt(start);
                sb.setCharAt(start,endChar);
                sb.setCharAt(end,startChar);
                start++;
                end--;
            }
        }
        System.out.println(sb);

    }
}
