package baekjoon.step.combinatoric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB10872 {
    public static int factorial(int n) {
        // base case
        if(n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(factorial(N));

    }

}
