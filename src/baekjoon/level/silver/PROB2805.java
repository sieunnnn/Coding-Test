package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2805 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int M;
    static int[] trees;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        trees = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, trees[i]);
        }

        System.out.println(solve());
    }

    public static int solve() {
        int maxLength = max;
        int minLength = 0;

        while(minLength <= maxLength) {
            int middleLength = (maxLength + minLength) / 2;
            long sum = 0;

            for (int tree : trees) {
                if (tree > middleLength) {
                    sum += (tree - middleLength);
                }
            }

            if (sum >= M) minLength = middleLength + 1;
            else maxLength = middleLength - 1;
        }

        return maxLength;
    }
}
