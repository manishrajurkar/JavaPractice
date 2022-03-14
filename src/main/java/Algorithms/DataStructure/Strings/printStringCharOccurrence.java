package Algorithms.DataStructure.Strings;

public class printStringCharOccurrence {
    public static void main(String[] args) {
       countString("aabbcc");


    }

    public static void countString(String str) {
         int count =0;
         char previousCharacter= 0 ;
         StringBuilder sb = new StringBuilder();
        if (str.length() == 0) {
            //return " ";
        } else {
            str.replace(" ", "");
        }

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {


//            if (chars[i] == previousCharacter) {  //a==0| a==0; |b==!
//              count++;                        //a:1 |a:2 |
//            }else if (previousCharacter !=0)  {  //b==0
//                sb.append(count).append(chars[i]);
//                previousCharacter=chars[i];
//                count =1;
//            }
//            System.out.println(sb);
        }

    }
}        


