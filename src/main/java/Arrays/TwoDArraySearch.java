package Arrays;


import java.util.Scanner;

public class TwoDArraySearch {
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
        System.out.println("Now enter which value you want to search");
        int searchNumber = sc.nextInt();

        for(int i=0; i<row;i++){
            for (int j=0; j<col;j++) {
                if(numbers[i][j] ==searchNumber)
                System.out.print("Number found on index (" +i +","+j +")");
            }

        }
       sc.close();
    }
}
