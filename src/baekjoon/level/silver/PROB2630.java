package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2630 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] graph;
    static boolean[][] visited;
    static int N;
    static int cntWhite = 0;
    static int cntBlue = 0;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j ++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solve(N, 0, 0);
        System.out.println(cntWhite);
        System.out.println(cntBlue);
    }

    public static void solve (int size, int y, int x) {
        if (checkColors(size, y, x)) {
            if (graph[y][x] == 0) {
                cntWhite ++;
            } else {
                cntBlue ++;
            }
            return;
        }

        int half = size / 2;
        solve(half, y, x);
        solve(half, y, x + half);
        solve(half, y + half, x);
        solve(half, y + half, x + half);
    }

    public static boolean checkColors (int size, int y, int x) {
        int color = graph[y][x];
        for (int i = y; i < y + size; i ++) {
            for (int j = x; j < x + size; j ++) {
                if (graph[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
