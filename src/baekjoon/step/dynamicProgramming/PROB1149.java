package baekjoon.step.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1149 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1][3];
        for (int i = 1 ; i <= N; i ++) {
            st = new StringTokenizer(br.readLine());

            int r = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            /**
             * 빨간색을 칠할때 최소값이 되려면,
             * 이전에 파란색 혹은 초록색을 칠해야 한다.
             * 그 둘의 비용 중 최솟값에 더해야 한다.
             */
            dp[i][0]= r + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1]= g + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2]= b + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        int min = Math.min(dp[N][0], dp[N][1]);
        System.out.println(Math.min(min, dp[N][2]));
    }
}
