package PracticeAssignment.Inerviews;

import java.util.Scanner;

public class PrintTheMonthUsingSwitch {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter month ");
        String month = sc.next();

        switch (month){
            case "Jan" : System.out.println("Jan");
            break;
            case "Feb" : System.out.println("Feb");
            break;
        }

    }


}
