package programmers.algorithmKit.bfsDfs;

import java.util.*;
public class PROB01 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public int solution(int[][] maps) {
        int m = maps.length; // 세로 길이
        int n = maps[0].length; // 가로 길이
        boolean[][] visited = new boolean[m][n];

        return bfs(maps, visited, 0, 0, m, n);
    }

    public static int bfs(int[][] maps, boolean[][] visited, int x, int y, int m, int n) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currX = current[0];
            int currY = current[1];

            if (currX == m - 1 && currY == n - 1) {
                return maps[currX][currY];
            }

            for (int i = 0; i < 4; i++) {
                int newX = currX + dx[i];
                int newY = currY + dy[i];

                if (newX >= 0 && newX < m && newY >= 0 && newY < n && maps[newX][newY] == 1 && !visited[newX][newY]) {
                    queue.offer(new int[]{newX, newY});
                    visited[newX][newY] = true;
                    maps[newX][newY] = maps[currX][currY] + 1;
                }
            }
        }

        return -1;
    }
}
