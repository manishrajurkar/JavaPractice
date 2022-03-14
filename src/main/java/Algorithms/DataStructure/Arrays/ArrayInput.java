package Algorithms.DataStructure.Arrays;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) throws IOException {

        //Take input for user for how many subjects mark needs to be Entered & Marks .



        Scanner sc = new Scanner(System.in);
        System.out.println("For how  many subjects do you want to add the marks?");
        int size = sc.nextInt();
        int marksInNumber[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter marks for " + i);

            marksInNumber[i] = sc.nextInt();
////            if (sc.nextInt() == 0){
////                return null;
//            }

        }
        for (int j = 0; j < marksInNumber.length; j++) {
            Arrays.sort(marksInNumber);
            Arrays.toString(marksInNumber);



            System.out.println("Entered marks are " + marksInNumber[j]);

        }
    }

    public static String storeInputToArray(int arr[]) {

      if (arr == null)
         return null;

      int maxIndex =arr.length-1;
      if (maxIndex ==-1)
          return "[]";

      for (int i=0;i<maxIndex ;i++) {

        }
        return "hello";
    }
}



