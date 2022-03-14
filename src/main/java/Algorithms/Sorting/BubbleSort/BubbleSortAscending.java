package Algorithms.Sorting;

public class BubbleSortAscending {

    /**
     *  in this sorting we want the Lowest number at first and Highest at the end
     *  {1,2,3,7,8}
     */
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arrayValues = {7,8,3,1,2};

        for (int i =0; i<arrayValues.length-1;i++){
            for(int j=0;j<arrayValues.length-i-1;j++){
                if(arrayValues[j]>arrayValues[j+1]){
                    int temp = arrayValues[j];
                    arrayValues[j] =arrayValues[j+1];
                    arrayValues[j+1]=temp;
                }
            }
        }
        printArray(arrayValues);
    }
}
