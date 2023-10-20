package baekjoon.step.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1912 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    static int[] numbers;
    static int[] dp;
    static int max;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        numbers = new int[n];
        for (int i = 0; i < n; i ++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        getMax();
    }

    public static void getMax() {
        dp = new int[n];
        dp[0] = numbers[0];
        max = dp[0];

        for (int i = 1; i < n; i ++) {
            /**
             * 누적합과의 비교.
             * 만약 numbers[i] 가 더 크다면 누적합을 끝내고 다시 시작할 수 있도록 dp[i] 에 numbers[i] 를 넣습니다.
             * 위를 구현하기 위해 Math.max 메소드를 썼습니다.
             */
            dp[i] = Math.max(dp[i - 1] + numbers[i], numbers[i]);
            max = Math.max(dp[i], max); // max 갱신
        }
        System.out.println(max);
    }
}
