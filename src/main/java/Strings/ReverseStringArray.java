package Strings;

public class ReverseStringArray {

    //https://cheonhyangzhang.gitbooks.io/leetcode-solutions/content/344-reverse-string.html
    //https://www.youtube.com/watch?v=VoZfjuuuOUc

    public static void reverseString(char arr[]){

         int start = 0;
         int end = arr.length -1 ;

         for (int i=0 ; i<arr.length; i++){
             if (start < end ){
                 char temp = arr [start];
                 arr[start]= arr[end];
                 arr[end]= temp;
                 start++;
                 end --;
             }

         }
        System.out.println(arr);
    }


    public static void main(String[] args) {

        char s [] = {'h','e','l','l','o'};
        reverseString(s);


    }

}