package Strings;

import java.util.Scanner;

public class StringLoopPrintCharactersVertically {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name"); //"Manish"
        String firstName = sc.next();
        System.out.println("Enter Last Name");
        String lastName = sc.next();  //"Rajurkar";

        String fullName = firstName +" "+ lastName;
        System.out.println("Full Name is  "+fullName);

        System.out.println("Now I will print the name vertically Character by Character");

        for (int i =0; i<fullName.length();i++){
            char newCharStr = fullName.charAt(i);
            System.out.println(newCharStr);
            //System.out.println(fullName.charAt(i));

        }
    }
}
