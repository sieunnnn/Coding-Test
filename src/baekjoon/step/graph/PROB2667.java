package baekjoon.step.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class PROB2667 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Integer> counts = new ArrayList<>();
    static int[][] graph;
    static boolean[][] visited;
    static int N;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int cnt;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i ++) {
            String[] temp = br.readLine().split("");
            for (int j = 0; j < N; j ++) {
                graph[i][j] = Integer.parseInt(temp[j]);
            }
        }
//        System.out.println(Arrays.deepToString(graph));

        for (int i = 0; i < N; i ++) {
            for (int j = 0; j < N; j ++) {
                if (graph[i][j] == 1 && !visited[i][j]) {
                    cnt = 0;
                    dfs(i, j);
                    counts.add(cnt);
                }
            }
        }

        Collections.sort(counts);
        System.out.println(counts.size());
        for (int count : counts) {
            System.out.println(count);
        }
    }

    public static void dfs (int y, int x) {
        visited[y][x] = true;
        cnt ++;

        for (int i = 0; i < 4; i ++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (graph[ny][nx] == 1 && !visited[ny][nx]) {
                    dfs(ny, nx);
                }
            }
        }
    }
}
