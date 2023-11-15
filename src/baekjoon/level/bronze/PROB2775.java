package baekjoon.level.bronze;

import java.util.Scanner;

public class PROB2775 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static int T, n, k;
    static int[][] dp;

    public static void main(String[] args) {
        T = sc.nextInt();
        for (int i = 0; i < T; i ++) {
            k = sc.nextInt();
            n = sc.nextInt();
            solve(n, k);
        }

        System.out.println(sb);
    }

    public static void solve(int n, int k) {
        dp = new int[k + 1][15];
        for (int i = 0; i <= 14; i ++) { // 0 층
            dp[0][i] = i;
        }

        for (int i = 1; i <= k; i ++) { // 1 층 부터
            for (int j = 1; j <= 14; j ++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        sb.append(dp[k][n]).append("\n"); // k 층 n 호
    }
}
