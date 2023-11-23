package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB18111 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, B;
    static int[][] graph;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        graph = new int[N][M];

        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j  < M; j ++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, graph[i][j]);
                min = Math.min(min, graph[i][j]);
            }
        }

        solve();
    }

    public static void solve() {
        int maxHeight = 0;
        int minTime = Integer.MAX_VALUE;

        for (int targetHeight = min; targetHeight <= max; targetHeight++) {
            int time = 0;
            int blocks = B;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int heightDiff = graph[i][j] - targetHeight;

                    if (heightDiff > 0) {
                        time += 2 * heightDiff;
                        blocks += heightDiff;

                    } else if (heightDiff < 0) {
                        time -= heightDiff;
                        blocks += heightDiff;
                    }
                }
            }

            if (blocks >= 0 && (time < minTime || (time == minTime && targetHeight > maxHeight))) {
                minTime = time;
                maxHeight = targetHeight;
            }
        }

        System.out.println(minTime + " " + maxHeight);
    }
}
