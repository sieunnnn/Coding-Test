package baekjoon.level.silver;

import java.io.IOException;
import java.util.Scanner;

public class PROB15990 {
    static Scanner sc = new Scanner(System.in);
    static int T;
    static int[][] dp;
    static final int MOD = 1000000009;

    public static void main(String[] args) throws IOException {
        T = sc.nextInt();
        dp = new int[100001][4];
        solve();
        for (int i = 0; i < T; i ++) {
            int temp = sc.nextInt();
            int value = (((dp[temp][1] + dp[temp][2]) % MOD) + dp[temp][3]) % MOD;
            System.out.println(value);
        }
    }

    static void solve() {
        dp[1][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for (int i = 4; i <= 100000; i ++) {
            dp[i][1] = (dp[i - 1][2] + dp[i - 1][3]) % MOD;
            dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % MOD;
            dp[i][3] = (dp[i  - 3][1] + dp[i - 3][2]) % MOD;
        }
    }
}
