package PracticeAssignment.Inerviews;

import java.util.ArrayList;
import java.util.List;

public class findNumericPattern {

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};

        //checkPattern(arr);
        checkPatternRegardlessOfPosition(arr);
    }

    public static void checkPattern(int[] arr ) {

        int [] pattern = {0,0,7};

        for ( int i=0; i<arr.length; i++ ){

            if (arr[i] == 0 && arr[i+1] ==0 && arr[i+2]==7){
                System.out.println( "Pattern found");
            }
        }
    }

    public static void checkPatternRegardlessOfPosition(int [] arr){
        List <Integer> list = new ArrayList<Integer>();

         StringBuffer bf = new StringBuffer();

         for (int i =0; i<arr.length; i++) {
             //System.out.println("INSIDE I : index->" + i  + "Value at index->" +arr[i]);
             //System.out.println("First Loop Run " + i + " time");
             for (int j=0 ;j<arr.length;j++) {
                 //System.out.println("INSIDE J: index->" +j  + "Value at index->" +arr[j]);
                 System.out.println("Second Loop Run " + j + " time");
//                 if (j == 0) {
//                     System.out.println("First zero found");
//                 }


             }

         }

    }
}
