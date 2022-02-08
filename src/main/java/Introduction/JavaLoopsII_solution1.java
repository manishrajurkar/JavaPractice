package Introduction;

import java.util.Scanner;

public class JavaLoopsII_solution1 {

    /**
     * https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
     * https://www.blogger.com/blog/posts/7486154503208211501
     */

    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Values ");
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = a;
            for (int j = 0; j < n; j++) {

                if (a > 0 && a <= 50 && b > 0 && b <= 50) {
                    res += (int) (Math.pow(2, j) * b);
                    System.out.print(Integer.toString(res) + ' ');

                System.out.print('\n');

                }else {
                    System.out.println("Invalid input");
                }
            }
            in.close();
        }
    }
}



