package baekjoon.step.prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB10986 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static long cnt = 0;  // 누적합의 개수가 매우 클 수 있으므로 long 사용

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        long[] remainders = new long[M];

        st = new StringTokenizer(br.readLine());
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(st.nextToken());
            int remainder = (int) (sum % M);
            remainders[remainder]++;
        }

        cnt += remainders[0];  // 나머지가 0 인 경우도 포함해야 함
        for (int i = 0; i < M; i++) {
            if (remainders[i] > 1) {
                cnt += remainders[i] * (remainders[i] - 1) / 2;  // 조합 공식 사용
            }
        }

        System.out.println(cnt);
    }
}
