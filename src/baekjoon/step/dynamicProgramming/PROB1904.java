package baekjoon.step.dynamicProgramming;

import java.util.Scanner;

public class PROB1904 {
    static Scanner sc = new Scanner(System.in);
    static int[] dp = new int[1000001];
    static int N;

    public static void main(String[] args) {
        N = sc.nextInt();

        getTileCnt();
        System.out.println(dp[N]);
    }

    public static void getTileCnt() {
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i < dp.length; i ++) {
            dp[i] = dp[i -2] + dp[i - 1];
            dp[i] %= 15746;
        }
    }
}
