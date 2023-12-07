package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PROB21736 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String[][] graph;
    static boolean[][] visited;
    static Queue<int[]> queue = new LinkedList<>();
    static int[] dy = {0, 0, 1, -1};
    static int[] dx = {-1, 1, 0, 0};
    static int N, M;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new String[N][M];
        visited = new boolean[N][M];
        int[] startNode = new int[2];

        for (int i = 0; i < N; i ++) {
            String[] temp = br.readLine().split("");
            for (int j = 0; j < temp.length; j ++) {
                graph[i][j] = temp[j];
                if (graph[i][j].equals("I")) {
                    startNode[0] = i;
                    startNode[1] = j;
                }
            }
        }

        queue.add(new int[]{startNode[0], startNode[1]});
        solve();

        if (count == 0) {
            System.out.println("TT");
        } else {
            System.out.println(count);
        }
    }

    public static void solve() {
        while (!queue.isEmpty()) {
            int[] startNode = queue.poll();
            int startY = startNode[0];
            int startX = startNode[1];

            for (int i = 0; i < 4; i ++) {
                int y = dy[i] + startY;
                int x = dx[i] + startX;

                if (y >= 0 && y < N && x >= 0 && x < M && !visited[y][x]) { // 범위 검사
                    if (graph[y][x].equals("P")) {
                        count++;
                    }
                    if (!graph[y][x].equals("X")) {
                        queue.add(new int[]{y, x});
                        visited[y][x] = true;
                    }
                }
            }
        }
    }
}
