package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2805 {
    static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static int[] trees;
    static long max = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        trees = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < trees.length; i ++) {
            trees[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, trees[i]);
        }

        solve();
    }

    public static void solve() {
        long minTreeLength = 0;
        long maxTreeLength = max;

        while (minTreeLength <= maxTreeLength) {
            long middleTreeLength = (maxTreeLength + minTreeLength) / 2;
            long sum = 0;

            for (int tree : trees) {
                if (tree > middleTreeLength) {
                    sum += tree - middleTreeLength;
                }
            }

            if (sum >= M) {
                minTreeLength = middleTreeLength + 1;
            } else {
                maxTreeLength = middleTreeLength - 1;
            }
        }

        System.out.println(maxTreeLength);
    }
}
