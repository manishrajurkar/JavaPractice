package Introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopsI_solution2 {

    /**
     * https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
     * https://www.blogger.com/blog/posts/7486154503208211501
     */

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
           if (N >= 2 && N <= 20) {
            for (int i = 1; i <= 10; i++) {
                int result = Math.multiplyExact(N,i);
                System.out.println(N + " x "+ i + " = " + result);
            }
        }
        bufferedReader.close();
    }
}
