package baekjoon.step.combinatoric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1010 {
    // nCr = n-1Cr + n-1Cr-1

    // 다리의 최대 개수가 30 개로 지정되어 있다.
    private static final int[][] dp = new int[31][31];

    public static void main(String[] args) throws IOException {

        /**
         * 서쪽 N 개, 동쪽 M 개
         * N 개만큼 다리를 지을건데, 다리를 지을 수 있는 경우의 수
         * M 개 중 N 개를 뽑는 문제 => 조합
         * 0 < N, M < 30
         *
         * 손으로 쓰면서 확인해보니 불필요한 연산이 중복되는 것을 알았습니다.
         * 테스트 케이스 1, 2 의 경우 수가 작아 depth 가 작지만, 수가 커질경우 문제가 생길 것 같습니다.
         * 따라서 아래와같이 이미 수행하거나 수행할 필요가 없는 연산은 제거하도록 코드를 변경하였습니다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int r = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            sb.append(combination(n, r)).append("\n");
        }

        System.out.println(sb);
    }

    public static int combination(int n, int r) {

        if (dp[n][r] > 0) {
            return dp[n][r];

        } else if (n == r || r == 0) {
            return dp[n][r] =  1;

        } else {
            return dp[n][r] = combination((n - 1), (r - 1)) + combination(n - 1, r);
        }
    }
}
