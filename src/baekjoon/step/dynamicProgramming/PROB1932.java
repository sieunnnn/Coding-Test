package baekjoon.step.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class PROB1932 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] dp;
    static int[][] numbers;
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        numbers = new int[N][N];
        dp = new int[N][N];

        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i + 1; j++) {
                numbers[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solve();
    }

    public static void solve() {
        dp[0][0] = numbers[0][0];

        for (int i = 1; i < dp.length; i ++) {
            for (int j = 0; j < i + 1; j ++) {
                if (j == 0){
                    dp[i][0] = dp[i - 1][0] + numbers[i][0];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + numbers[i][j];
                }
            }
        }

        Arrays.sort(dp[dp.length - 1]);
        System.out.println(dp[dp.length - 1][dp.length - 1]);
    }
}
