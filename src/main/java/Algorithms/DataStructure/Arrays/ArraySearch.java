package Algorithms.DataStructure.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
    //take an array as input from user,search for given number and print the index.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int size = sc.nextInt();
        int marks [] = new int[size];

        for(int i =0;i<size;i++){
            System.out.println("Enter Marks");
             marks[i] = sc.nextInt() ;
        }
        Arrays.sort(marks);
        System.out.println("Please enter marks to be searched");
        int searchValue = sc.nextInt();

        for(int j=0;j<marks.length;j++){

            if (marks[j]== searchValue){
                System.out.println("Marks found at index  "+j);
            }

        }
        sc.close();
    }

}
