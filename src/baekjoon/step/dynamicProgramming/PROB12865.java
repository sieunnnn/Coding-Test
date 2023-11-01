package baekjoon.step.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB12865 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, K;
    static int[][] dp;
    static int[][] items;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 물품의 수
        K = Integer.parseInt(st.nextToken()); // 버틸 수 있는 무게

        dp = new int[N + 1][K + 1];
        items = new int[N + 1][2];

        for (int i = 1; i <= N; i ++) {
            st = new StringTokenizer(br.readLine());
            items[i][0] = Integer.parseInt(st.nextToken()); // 무게
            items[i][1] = Integer.parseInt(st.nextToken()); // 가치
        }
        dp();
        System.out.println(dp[N][K]);
    }

    public static void dp() {
        for (int i = 1; i <= N; i ++) {
            for (int j = 1; j <= K; j ++) {
                dp[i][j] = dp[i - 1][j]; // 이전 행 복사
                if (j - items[i][0] >=0) {
                    dp[i][j] = Math.max(dp[i][j], items[i][1] + dp[i - 1][j - items[i][0]]);
                }
            }
        }
    }
}
