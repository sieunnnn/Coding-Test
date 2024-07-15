package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PROB2178 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Queue<int[]> queue;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dy = {0, 0, 1, -1};
    static int[] dx = {-1, 1, 0, 0};
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] temp = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(temp[j]);
            }
        }

        System.out.println(bfs(0, 0));
    }

    public static int bfs(int y, int x) {
        visited = new boolean[N][M];
        visited[y][x] = true;

        int[] start = {y, x, 1};
        queue = new LinkedList<>();
        queue.add(start);


        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentY = current[0];
            int currentX = current[1];
            int currentCount = current[2];

            if (currentY == N - 1 && currentX == M - 1) {
                return currentCount;
            }

            for (int i = 0; i < 4; i++) {
                int ny = currentY + dy[i];
                int nx = currentX + dx[i];

                if (ny >=0 && nx >= 0 && ny < N && nx < M && !visited[ny][nx] && graph[ny][nx] == 1) {

                    visited[ny][nx] = true;
                    queue.add(new int[] {ny, nx, currentCount + 1});
                }
            }
        }

        return -1;
    }
}
