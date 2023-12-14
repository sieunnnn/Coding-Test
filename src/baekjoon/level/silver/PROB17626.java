package baekjoon.level.silver;

import java.util.Scanner;

public class PROB17626 {
    static Scanner sc = new Scanner(System.in);
    static int[] dp = new int[50001];
    static int n;

    public static void main(String[] args) {
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        System.out.println(dp[n]);
    }
}
