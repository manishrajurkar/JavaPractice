package Algorithms.DataStructure.Strings;

import java.util.Scanner;

public class StringReplaceCapitalToLowerSmallToUpper {
    //input : Manish

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name"); //"Manish"
        String firstName = sc.nextLine();
        System.out.println("First Name is  " + firstName);

        StringBuilder sb = new StringBuilder();

        char [] charValues = firstName.toCharArray();

        for (int i =0; i<charValues.length;i++){
            if ((Character.isUpperCase(charValues[i]))){
                sb.insert(i,Character.toLowerCase(charValues[i]));
                firstName.trim();
                firstName.toLowerCase();
                firstName.replaceAll("[a-z]" ,"");
            }
            else if ((Character.isLowerCase(charValues[i]))){

             sb.insert(i,Character.toUpperCase(charValues[i]));
            }
        }
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.toString());
    }
}
