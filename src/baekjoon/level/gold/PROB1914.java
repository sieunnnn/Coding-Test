package baekjoon.level.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PROB1914 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;


    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        BigInteger count = BigInteger.valueOf(2).pow(N).subtract(BigInteger.ONE);
        System.out.println(count);

        if (N <= 20) {
            solve(N, 1, 2, 3);
        }
    }

    public static void solve(int n, int start, int middle, int finish) {
        if (n == 0) return;

        solve(n - 1, start, finish, middle);
        System.out.println(start + " " + finish);
        solve(n - 1, middle, start, finish);
    }
}