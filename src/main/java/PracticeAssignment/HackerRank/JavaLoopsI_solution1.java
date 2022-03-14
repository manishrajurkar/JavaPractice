package PracticeAssignment.HackerRank;
import java.io.IOException;
import java.util.Scanner;

public class JavaLoopsI_solution1 {

    /**
     * https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
     * https://www.blogger.com/blog/posts/7486154503208211501
     */

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N >= 2 && N <= 20) {
            for (int i = 1; i <= 10; i++) {
                int result = Math.multiplyExact(N, i);
                System.out.println(N + " x " + i + " = " + result);
            }
        }else System.out.println("Enter number between 2 and 20");
        scanner.close();
    }
}



