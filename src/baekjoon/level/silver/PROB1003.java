package baekjoon.level.silver;

import java.util.Scanner;

public class PROB1003 {
    static Scanner sc = new Scanner(System.in);
    static int T;
    static int N;
    static StringBuilder sb = new StringBuilder();
    static int[][] dp = new int[41][2];

    public static void main(String[] args) {
        T = sc.nextInt();
        solve();
        for (int i = 0; i < T; i ++) {
            N = sc.nextInt();
            sb.append(dp[N][0]).append(" ").append(dp[N][1]).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void solve() {
        dp[0][0] = 1;
        dp[1][1] = 1;

        for (int i = 2; i < dp.length; i ++) {
            dp[i][0] = dp[i - 2][0] + dp[i - 1][0];
            dp[i][1] = dp[i - 2][1] + dp[i - 1][1];
        }
    }
}
