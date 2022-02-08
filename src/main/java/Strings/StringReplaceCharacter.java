package Strings;

import java.util.Scanner;

public class StringReplaceCharacter {
    //input : Manish

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name"); //"Manish"
        String firstName = sc.next();
        System.out.println("First Name is  " + firstName);

        String updateString ="";

        for (int i =0; i<firstName.length();i++){
            if (! (firstName.charAt(i)== ' ')){
             updateString += 'A';
            }
            else{
             updateString +=firstName.charAt(i);
            }
        }
        System.out.println(updateString);
    }
}
