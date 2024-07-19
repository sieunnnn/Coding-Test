package gold;

import java.io.*;
import java.util.*;

public class PROB9084 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();
    static StringTokenizer st;
    static int[] coins;
    static int[] dp;
    static int T;
    static int N;
    static int money;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            coins = new int[N];

            for (int i = 0; i < N; i++) {
                coins[i] = Integer.parseInt(st.nextToken());
            }

            money = Integer.parseInt(br.readLine());
            dp = new int[money + 1];
            solve();
        }

        System.out.println(sb.toString());
    }

    public static void solve() {
        dp[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= money; i++) {
                dp[i] += dp[i - coin];
            }
        }

        sb.append(dp[money]).append("\n");
    }
}
