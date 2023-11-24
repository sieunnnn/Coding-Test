package baekjoon.level.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PROB7569 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][][] graph;
    static boolean[][][] isChecked;
    static int M, N, H;
    static Queue<int[]> startLocations = new LinkedList<>();
    static int[] dz = {1, -1, 0, 0, 0, 0}; // 위, 아래
    static int[] dy = {0 ,0 ,1 , -1, 0, 0}; // 위, 아래
    static int[] dx = {0 ,0, 0, 0, 1, -1}; // 우, 좌

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        graph = new int[H][N][M];
        isChecked = new boolean[H][N][M];

        for (int i = 0; i < H; i ++) {
            for (int j = 0; j < N; j ++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k ++) {
                    graph[i][j][k] = Integer.parseInt(st.nextToken());
                    if (graph[i][j][k] == 1) {
                        startLocations.add(new int[]{i, j, k});
                    }
                }
            }
        }
        solve();
    }

    public static void solve() {
        while(!startLocations.isEmpty()) {
            int[] startLocation = startLocations.poll();
            int z = startLocation[0];
            int y = startLocation[1];
            int x = startLocation[2];

            for (int i = 0; i < 6; i ++) {
                int newZ = z + dz[i];
                int newY = y + dy[i];
                int newX = x + dx[i];

                if (newZ < H && newZ >= 0 && newY < N && newY >= 0 && newX < M && newX >= 0) {
                    if (graph[newZ][newY][newX] == 0 && !isChecked[newZ][newY][newX]) {
                        isChecked[newZ][newY][newX] = true;
                        startLocations.add(new int[]{newZ, newY, newX});
                        graph[newZ][newY][newX] = graph[z][y][x] + 1; // 익은 날짜를 구해야 하므로
                    }
                }
            }
        }

        int maxDay = Integer.MIN_VALUE;
        for (int i = 0; i < H; i ++) {
            for (int j = 0; j < N; j ++) {
                for (int k = 0; k < M; k ++) {
                    if (graph[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    maxDay = Math.max(maxDay, graph[i][j][k]);
                }
            }
        }

        System.out.println(maxDay == 1 ? 0 : maxDay - 1);
    }
}
