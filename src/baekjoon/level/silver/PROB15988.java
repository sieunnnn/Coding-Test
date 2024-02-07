package baekjoon.level.silver;

import java.util.Scanner;

public class PROB15988 {
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
        dp[3] = 4;

        for(int i = 4; i < dp.length; i ++) {
            dp[i] = ((dp[i - 1] + dp[i - 2]) %  MOD + dp[i - 3]) % MOD;
        }
    }
}

