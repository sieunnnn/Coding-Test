package baekjoon.level.silver;

import java.util.Scanner;

public class PROB2688 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static int T;
    static int N;
    static long[][] dp;

    public static void main(String[] args) {
        T = sc.nextInt();
        dp = new long[65][10];
        solve();

        for (int i = 0; i < T; i ++) {
            long sum = 0;
            N = sc.nextInt();
            for (int j = 0; j < 10; j ++) {
                sum += dp[N][j];
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void solve() {
        for (int i = 0; i < 10; i ++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i < 65; i ++) {
            for (int j = 0; j < 10; j ++) {
                for (int k = j; k < 10; k ++) {
                    dp[i][j] += dp[i - 1][k];
                }
            }
        }
//        System.out.println(Arrays.deepToString(dp));
    }
}
