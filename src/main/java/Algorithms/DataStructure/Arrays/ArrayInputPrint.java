package Algorithms.DataStructure.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputPrint {
    //take an array length as input from user,print all the values.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int size = sc.nextInt();
        int marks [] = new int[size];

        for(int i =0;i<size;i++){
            System.out.println("Enter Marks");
             marks[i] = sc.nextInt() ;
        }
        //Arrays.sort(marks);

        for(int j=0;j<marks.length;j++){
            System.out.println(marks[j] );

        }
        //sc.close();
    }

}
