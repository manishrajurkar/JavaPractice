package Arrays;


import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int row = sc.nextInt();
        System.out.println("Enter columns");
        int col = sc.nextInt();

        int [] [] numbers = new int[row][col];
//input
        for (int i =0; i<row;i++){
            System.out.println("please enter value for row  "+i);
            for(int j=0;j<col;j++){
                numbers[i][j]= sc.nextInt();
            }
         }
//output
        for(int i=0; i<row;i++){
            for (int j=0; j<col;j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
