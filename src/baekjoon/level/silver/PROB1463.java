package baekjoon.level.silver;

import java.io.IOException;
import java.util.Scanner;

public class PROB1463 {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static int[] dp = new int[1000001];

    public static void main(String[] args) throws IOException {
        N = sc.nextInt();
        dp();
    }

    public static void dp() {
        if (N >= 2) dp[2] = 1;
        if (N >= 3) dp[3] = 1;

        for (int i = 4; i <= N; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        System.out.println(dp[N]);
    }
}
