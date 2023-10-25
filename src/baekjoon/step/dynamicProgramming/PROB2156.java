package baekjoon.step.dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class PROB2156 {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static int[] wines = new int[10001];
    static int[] dp = new int[10001];

    public static void main(String[] args) {
        N = sc.nextInt();

        for (int i = 1; i < N + 1; i++) {
            wines[i] = sc.nextInt();
        }

//        System.out.println(Arrays.toString(wines));
        solve();
    }

    public static void solve() {
        dp[1] = wines[1];
        dp[2] = Math.max((wines[1] + wines[2]), dp[1]);

        for (int i = 3; i < N + 1; i ++) {
            int temp = Math.max(dp[i -2] + wines[i], (wines[i] + wines[i - 1] + dp[i - 3]));
            dp[i] = Math.max(temp, dp[i - 1]);
        }


//        System.out.println(Arrays.toString(dp));
        System.out.println(dp[N]);
    }
}
