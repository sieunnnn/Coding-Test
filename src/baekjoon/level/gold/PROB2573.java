package gold;

import java.io.*;
import java.util.*;

public class PROB2573 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] graph;
    static int N, M;
    static int[] dy = {0, 0, 1, -1}; // 좌 우 위 아래
    static int[] dx = {-1, 1, 0, 0};
    static int year;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while(true) {
            int count = checkIce();
            if (count == 0) {
                year = 0;
                break;
            }

            if (count > 1) break;

            meltIce();
            year++;
        }

        System.out.println(year);
    }

    public static void meltIce() {
        int[][] tempGraph = new int[N][M];

        for (int y = 0; y < N; y++) {
            for (int x = 0; x < M; x++) {
                if (graph[y][x] > 0) {
                    int count = 0;

                    for (int i = 0; i < 4; i++) {
                        int ny = y + dy[i];
                        int nx = x + dx[i];

                        if (ny >= 0 && nx >= 0 && ny < N && nx < M && graph[ny][nx] == 0) {
                            count++;
                        }
                    }

                    tempGraph[y][x] = graph[y][x] - count;
                    if (tempGraph[y][x] < 0) tempGraph[y][x] = 0;
                }
            }
        }

        updateGraph(tempGraph);
    }

    public static void updateGraph(int[][] tempGraph) {
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < M; x++) {
                graph[y][x] = tempGraph[y][x];
            }
        }
    }

    public static int checkIce() {
        boolean[][] visited = new boolean[N][M];
        int count = 0;

        for (int y = 0; y < N; y++) {
            for (int x = 0; x < M; x++) {
                if (graph[y][x] > 0 && !visited[y][x]) {
                    dfs(y, x, visited);
                    count++;
                }
            }
        }

        return count;
    }

    public static void dfs (int y, int x, boolean[][] visited) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{y, x});
        visited[y][x] = true;

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int currentY = current[0];
            int currentX = current[1];

            for (int i = 0; i < 4; i++) {
                int ny = currentY + dy[i];
                int nx = currentX + dx[i];

                if (ny >= 0 && nx >= 0 && ny < N && nx < M && graph[ny][nx] > 0 && !visited[ny][nx]) {
                    stack.push(new int[]{ny, nx});
                    visited[ny][nx] = true;
                }
            }
        }
    }
}