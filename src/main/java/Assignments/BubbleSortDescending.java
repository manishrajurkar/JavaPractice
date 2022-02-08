package Assignments;

public class BubbleSortDescending {

    /**
     *  in this sorting we want the highest number at first and lowest at the end
     *  {8,7,3,2,1}
     */

    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arrayValues = {7,8,3,1,2};

        for (int i=0 ; i<arrayValues.length-1;i++){

             for (int j=0 ; j<arrayValues.length-i-1;j++){

                 if(arrayValues[j] < arrayValues[j+1]){

                     int temp = arrayValues[j+1];
                     arrayValues[j+1] =arrayValues[j];
                     arrayValues[j] = temp;

                 }

             }


        }
        printArr(arrayValues);

    }
}
