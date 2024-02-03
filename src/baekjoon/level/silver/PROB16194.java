package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB16194 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[] numbers;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        numbers = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i ++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        solve(N);
        System.out.println(dp[N]);
    }

    public static int solve(int n) {
        if (dp[n] != 0) {
            return dp[n];
        }

        int min = numbers[n];
        for (int i = 1; i < n; i ++) {
            int value = solve(i) + numbers[n - i];
            min = Math.min(min, value);
        }

        return dp[n] = min;
    }
}

