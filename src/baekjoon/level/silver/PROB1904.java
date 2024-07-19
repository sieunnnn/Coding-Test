package silver;

import java.io.*;

public class PROB1904 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] dp = new int[1000001];
    static int N;
    static final int MOD = 15746;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        getTileCnt();
        System.out.println(dp[N]);
    }

    public static void getTileCnt() {
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
            dp[i] %= MOD;
        }
    }
}
