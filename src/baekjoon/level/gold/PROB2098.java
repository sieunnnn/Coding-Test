package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2098 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[][] W;
    static int[][] dp;
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        W = new int[N][N];
        dp = new int[1 << N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                W[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        init();

        System.out.println(TSP(1, 0));
    }

    public static void init() {
        for (int i = 0; i < (1 << N); i++) {
            for (int j = 0; j < N; j++) {
                dp[i][j] = INF;
            }
        }
    }

    public static int TSP(int bit, int current) {
        if (bit == (1 << N) - 1) {
            if (W[current][0] > 0) {
                return W[current][0];
            }
            return INF;
        }

        if (dp[bit][current] != INF) {
            return dp[bit][current];
        }

        for (int i = 0; i < N; i++) {
            if ((bit & (1 << i)) == 0 && W[current][i] > 0) {
                dp[bit][current] = Math.min(dp[bit][current], TSP(bit | (1 << i), i) + W[current][i]);
            }
        }

        return dp[bit][current];
    }
}
