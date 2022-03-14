package JavaComplete.JavaLoops.ExceptionHandlingPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchIntegerInput {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter value for first Integer");
            int x = sc.nextInt();
            System.out.println("Please enter value for first Integer");
            int y = sc.nextInt();

            int z = x/y;
            System.out.println(z);

        } catch (ArithmeticException |InputMismatchException |NullPointerException e) {

            if (e instanceof InputMismatchException){
                //System.out.println("Input is not integer");
                throw new InputMismatchException();
            }
            else if (e instanceof ArithmeticException){
                //System.out.println("Something is wrong");
                throw new ArithmeticException("/ zero");
            }
            else if (e instanceof NullPointerException){
               // System.out.println("Null input is not allowed");
                throw new NullPointerException();
            }
        }

    }

}
