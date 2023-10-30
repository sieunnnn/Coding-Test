package baekjoon.step.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB2565 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[][] lines;
    static int[] dp;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        lines = new int[N][2];
        dp = new int[N];

        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            lines[i][0] = Integer.parseInt(st.nextToken());
            lines[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(lines, (int[] o1, int[] o2) -> {
            return o1[0] - o2[0];
        });

        dp();

        System.out.println(N - max);
    }

    public static void dp() {
        for (int i = 0; i < N; i ++) {
            dp[i] = 1; // 자기 자신
            for (int j = 0; j < i; j ++) {
                if (lines[j][1] < lines[i][1]) { // 현재 전봇대 보다 이전에 있는 전봇대들의 값이 작아야 한다.
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
    }
}
