package baekjoon.level.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB15661 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[][] graph;
    static boolean[] used;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        used = new boolean[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        backTracking(0);
        System.out.println(min);
    }

    public static void backTracking(int depth) {
        if (depth == N) {
            calculateDifference();
            return;
        }

        used[depth] = true;
        backTracking(depth + 1);
        used[depth] = false;
        backTracking(depth + 1);
    }

    public static void calculateDifference() {
        int startTeamTotal = 0, linkTeamTotal = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (used[i] && used[j]) startTeamTotal += graph[i][j];
                if (!used[i] && !used[j]) linkTeamTotal += graph[i][j];
            }
        }
        min = Math.min(Math.abs(startTeamTotal - linkTeamTotal), min);
    }
}
