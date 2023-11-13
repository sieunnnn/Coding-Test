package baekjoon.step.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1654 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int K, N;
    static long[] lengths;
    static int count;
    static long max = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        lengths = new long[K];

        for (int i = 0; i < K; i ++) {
            lengths[i] = Long.parseLong(br.readLine());
            max = Math.max(max, lengths[i]);
        }
        solve();
    }

    public static void solve() {
        long minLength = 1;
        long maxLength = max;
        long half;

        while(minLength <= maxLength) {
            count = 0;
            half = (minLength + maxLength) / 2;

             for (int i = 0; i < K; i ++) {
                 count += lengths[i] / half;
             }

             if (count < N) {
                 maxLength = half - 1;
             } else {
                 minLength = half + 1;
             }
        }
        System.out.println(maxLength);
    }
}
