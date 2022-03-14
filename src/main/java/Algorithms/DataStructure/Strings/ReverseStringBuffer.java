package Algorithms.DataStructure.Strings;

public class ReverseStringBuffer {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("He llo");

        for(int i=0; i<sb.length()/2;i++){
            int start = i;
            int end = sb.length() - 1 - i;  //5-0-1 =4 | 5-1-1=3 |

            char frontChar = sb.charAt(start);
            char backChar = sb.charAt(end);

            sb.setCharAt(start,backChar);
            sb.setCharAt(end,frontChar);
        }
        System.out.println(sb);

    }

}
