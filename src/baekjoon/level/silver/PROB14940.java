package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PROB14940 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[][] graph;
    static int[][] distances; // 결과
    static boolean[][] visited;
    static int[] dx = {0 ,0, 1, -1}; // 좌, 우, 위, 아래
    static int[] dy = {-1, 1, 0, 0};
    static int n, m; // 세로, 가로
    static int x, y; // 가로, 세로

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];
        distances = new int[n][m];

        for(int i = 0; i < n; i ++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j ++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if (graph[i][j] == 2) {
                    y = i;
                    x = j;
                } else if (graph[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }

        bfs(y, x);

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++) {
                if (!visited[i][j]) {
                    sb.append(-1).append(" ");
                } else {
                    sb.append(distances[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void bfs (int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y, x});
        visited[y][x] = true;

        while (!queue.isEmpty()) {
            int current[] = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextY = current[0] + dy[i];
                int nextX = current[1] + dx[i];
                if (nextY < n && nextY >= 0 && nextX < m && nextX >= 0) {
                    if (!visited[nextY][nextX] && graph[nextY][nextX] == 1) {
                        visited[nextY][nextX] = true;
                        distances[nextY][nextX] = distances[current[0]][current[1]] + 1;
                        queue.add(new int[]{nextY, nextX});
                    }
                }
            }
        }
    }
}
