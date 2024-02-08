package baekjoon.level.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB2096 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[][] graph;
    static int[][][] dp;
    static int max;
    static int min;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        graph = new int[N][3];
        dp = new int[N][3][2];

        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j ++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
//        System.out.println(Arrays.deepToString(graph));
        solve();
    }

    public static void solve() {
        // 첫 줄 초기화
        for (int j = 0; j < 3; j++) {
            dp[0][j][0] = graph[0][j];
            dp[0][j][1] = graph[0][j];
        }

        // 점수 계산
        for (int i = 1; i < N; i++) {
            dp[i][0][0] = Math.max(dp[i - 1][0][0], dp[i - 1][1][0]) + graph[i][0];
            dp[i][0][1] = Math.min(dp[i - 1][0][1], dp[i - 1][1][1]) + graph[i][0];

            dp[i][1][0] = Math.max(Math.max(dp[i - 1][0][0], dp[i - 1][1][0]), dp[i - 1][2][0]) + graph[i][1];
            dp[i][1][1] = Math.min(Math.min(dp[i - 1][0][1], dp[i - 1][1][1]), dp[i - 1][2][1]) + graph[i][1];

            dp[i][2][0] = Math.max(dp[i - 1][1][0], dp[i - 1][2][0]) + graph[i][2];
            dp[i][2][1] = Math.min(dp[i - 1][1][1], dp[i - 1][2][1]) + graph[i][2];
        }

        // 최대 점수와 최소 점수 찾기
        max = Math.max(dp[N - 1][0][0], Math.max(dp[N - 1][1][0], dp[N - 1][2][0]));
        min = Math.min(dp[N - 1][0][1], Math.min(dp[N - 1][1][1], dp[N - 1][2][1]));

        // 결과 출력
        System.out.println(max + " " + min);
    }
}
