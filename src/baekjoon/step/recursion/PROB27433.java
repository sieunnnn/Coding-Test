package baekjoon.step.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB27433 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    public static long factorial(int N) {
        // base case
        if (N <= 0) return 1;
        return (long) N * factorial(N - 1);
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        System.out.println(factorial(N));

    }

}
