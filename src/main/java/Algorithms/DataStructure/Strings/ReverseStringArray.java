package Algorithms.DataStructure.Strings;

public class ReverseStringArray {

    //https://cheonhyangzhang.gitbooks.io/leetcode-solutions/content/344-reverse-string.html
    //https://www.youtube.com/watch?v=VoZfjuuuOUc

    public static void reverseString(String str){
//         int start = 0;
//         int end = arr.length -1 ;
//
//         for (int i=0 ; i<arr.length; i++){
//             if (start < end ){
//                 char temp = arr [start];
//                 arr[start]= arr[end];
//                 arr[end]= temp;
//                 start++;
//                 end --;
//             }
//         }
//        System.out.println(arr);


        char charArray [] = str.toCharArray();
        //System.out.println(charArray);
        int start = 0;
        int end = charArray.length -1;



        for (int i=0;i<charArray.length;i++){

            if (start <end){
                char temp = charArray[start];
                charArray[i] = charArray[end];
                charArray[end]=temp;
                start++;
                end--;
            }

        }
        System.out.println(charArray);
    }

    public static void main(String[] args) {
//        char s [] = {'h','e','l','l','o'};
//        reverseString(s);
        reverseString("Hello");


    }

}