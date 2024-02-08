package baekjoon.level.silver;

import java.util.Scanner;

public class PROB2579 {
    static Scanner sc = new Scanner(System.in);
    static int T;
    static int[] stairs;
    static int[] dp;

    public static void main(String[] args) {
        T = sc.nextInt();
        stairs = new int[T];
        dp = new int[T];

        for (int i = 0; i < T; i++) {
            stairs[i] = sc.nextInt();
        }

        solve();
        System.out.println(dp[T - 1]);
    }

    public static void solve() {
        dp[0] = stairs[0];
        if (T > 1) dp[1] = stairs[1] + stairs[0];
        if (T > 2) dp[2] = Math.max(stairs[1] + stairs[2], stairs[0] + stairs[2]);

        for (int i = 3; i < T; i++) {
            dp[i] = Math.max(dp[i - 3] + stairs[i - 1] + stairs[i], dp[i - 2] + stairs[i]);
        }
    }
}
