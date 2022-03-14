package Algorithms.Patterns;

public class PrintRightSlidingPattern {

    public static void main(String[] args) {

        int row =4;

        for (int i=0; i<row; i++){
            for(int j=2*(row-1);j>=0;j--){
                System.out.println("");
            }
            System.out.print("*");

        }
        
    }
}
