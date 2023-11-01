package baekjoon.step.prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB16139 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;
    static int[][] dp;
    static int N;

    public static void main(String[] args) throws IOException {
        str = br.readLine();
        N = Integer.parseInt(br.readLine());

        dp = new int[str.length()][26];
        getPrefixSum(str);

        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            char alphabet = st.nextToken().charAt(0);
            int charIdx = alphabet - 'a';
            int startIdx = Integer.parseInt(st.nextToken());
            int endIdx = Integer.parseInt(st.nextToken());
            solve(charIdx, startIdx, endIdx);
        }

        System.out.println(sb);
    }

    public static void getPrefixSum(String str) {
        dp[0][str.charAt(0) -'a']++; // 0 번째 초기화
        for (int i = 1; i <str.length(); i ++) {
            int temp = str.charAt(i) - 'a';

            for (int j = 0; j < 26; j ++) {
                dp[i][j] = dp[i - 1][j]; // 이전 행 복사
            }
            dp[i][temp] ++; // 문자열에 해당하는 인덱스 증가
        }
    }

    public static void solve(int charIdx, int startIdx, int endIdx) {
        if (startIdx == 0) {
            sb.append(dp[endIdx][charIdx]).append("\n");
        } else {
            sb.append(dp[endIdx][charIdx] - dp[startIdx - 1][charIdx]).append("\n");
        }
    }
}
