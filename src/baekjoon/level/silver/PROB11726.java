package baekjoon.level.silver;

import java.util.Scanner;

public class PROB11726 {
    static Scanner sc = new Scanner(System.in);
    static int[] dp;
    static int n;

    public static void main(String[] args) {
        n = sc.nextInt();
        dp = new int[1000];
        solve();
    }

    public static void solve() {
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i < dp.length; i ++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
        }

        System.out.println(dp[n - 1]);
    }
}
