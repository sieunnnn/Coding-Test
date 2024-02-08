package baekjoon.level.silver;
import java.util.Scanner;

public class PROB11057 {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static int[][] dp;
    static int MOD = 10007;

    public static void main(String[] args) {
        N = sc.nextInt();
        dp = new int[1001][10];
        solve();

        int sum = 0;
        for (int i = 0; i < 10; i ++) {
            sum = (sum + dp[N][i]) % MOD;
        }
        System.out.println(sum);
    }

    public static void solve() {
        for (int i = 0; i < 10; i ++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= N; i ++) {
            for (int j = 0; j < 10; j ++) {
                for (int k = 0; k <= j; k ++) {
                    dp[i][j] = (dp[i][j] + dp[i-1][k]) % MOD;
                }
            }
        }
    }
}
