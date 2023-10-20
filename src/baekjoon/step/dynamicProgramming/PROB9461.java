package baekjoon.step.dynamicProgramming;

import java.util.Scanner;

public class PROB9461 {
    // 1, 1, 1, 2, 2, 3, 4, 5, 7, 9
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static long[] dp = new long[101];
    static int T;
    static int N;

    public static void main(String[] args) {
        T = sc.nextInt();
        solution();
        for (int i = 0; i < T; i ++) {
            N = sc.nextInt();
            sb.append(dp[N]).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void solution() {
        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;

        for (int i = 4; i < dp.length; i ++) {
            dp[i] = dp[i - 3] + dp[i - 2];
        }
    }
}
