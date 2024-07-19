package bronze;

import java.io.*;

public class PROB2748 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long[] dp;
    static int n;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        dp = new long[n + 1];
        setFibonacci();
        System.out.println(dp[n]);

    }

    public static void setFibonacci() {
        dp[1] = 1L;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
    }
}
