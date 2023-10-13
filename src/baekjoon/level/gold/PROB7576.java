package baekjoon.level.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PROB7576 {

    // 0: 덜익은 토마토 -1: 토마토 없음 1: 익은 토마토

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] dx = {-1, 1, 0, 0}; // 좌 우 위 아래
    static int[] dy = {0, 0, 1, -1}; // 좌 우 위 아래
    static int[][] board;
    static Queue<int[]> queue = new LinkedList<>(); // x, y, day
    static int x, y;
    static int day = 0;
    static int nx, ny;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        board = new int[y][x];
        for (int i = 0; i < y; i ++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < x; j ++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 1) {
                    queue.add(new int[] {j, i, 0}); // x, y, day
                }
            }
        }

        bfs();
    }

    public static void bfs () {
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            day = temp[2];

            for (int i = 0; i < 4; i ++) { // 4 방향
                nx = temp[0] + dx[i];
                ny = temp[1] + dy[i];

                if (0 <= nx && nx < x && 0 <= ny && ny < y) {
                    if (board[ny][nx] == 0) {
                        board[ny][nx] = 1;
                        queue.add(new int[] {nx, ny, day + 1});
                    }
                }
            }
        }

        if (checkTomato()) {
            System.out.println(day);
        } else {
            System.out.println(-1);
        }
    }

    public static boolean checkTomato() {
        for (int i = 0; i < y; i ++) {
            for (int j = 0; j < x; j ++) {
                if (board[i][j] == 0) return false; // 덜익은 토마토 존재
            }
        }

        return true;
    }
}
