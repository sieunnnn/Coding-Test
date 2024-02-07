package baekjoon.level.bronze;

import java.util.Scanner;

public class PROB10870 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] dp = new int[21];

    public static void main(String[] args) {
        n = sc.nextInt();
        solve();
        System.out.println(dp[n]);
    }

    public static void solve() {
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for(int i = 3; i < dp.length; i ++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
    }
}
