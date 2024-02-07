package baekjoon.level.silver;

import java.util.Scanner;

public class PROB15991 {
    static Scanner sc = new Scanner(System.in);
    static int T;
    static int n;
    static int[] dp = new int[1000001];
    static StringBuilder sb = new StringBuilder();
    static int MOD = 1000000009;

    public static void main(String[] args) {
        T = sc.nextInt();
        solve();
        for (int i = 0; i < T; i ++) {
            n = sc.nextInt();
            sb.append(dp[n]).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void solve() {
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 2;
        dp[4] = 3;
        dp[5] = 3;
        dp[6] = 6;

        for(int i = 7; i < dp.length; i ++) {
            dp[i] = ((dp[i - 2] + dp[i - 4]) %  MOD + dp[i - 6]) % MOD;
        }
    }
}
