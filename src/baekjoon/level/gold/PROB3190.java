package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PROB3190 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, K, L;
    static int[][] graph;
    static Map<Integer, String> directions = new HashMap<>();
    static int[] dx = {0, 1, 0, -1}; // 위, 오른쪽, 아래, 왼쪽
    static int[] dy = {-1, 0, 1, 0};
    static int currentDirection = 1;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        graph = new int[N][N];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            graph[y - 1][x - 1] = 1;
        }

        L = Integer.parseInt(br.readLine());
        for (int i = 0; i < L; i++) {
            st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            String direction = st.nextToken();
            directions.put(time, direction);
        }

        System.out.println(solve());
    }

    public static int solve() {
        Deque<int[]> snake = new ArrayDeque<>();
        snake.offer(new int[]{0, 0});
        boolean[][] visited = new boolean[N][N];
        visited[0][0] = true;

        int currentTime = 0;
        int currentX = 0;
        int currentY = 0;

        while (true) {
            currentTime++;
            currentX += dx[currentDirection];
            currentY += dy[currentDirection];

            if (currentX < 0 || currentX >= N || currentY < 0 || currentY >= N || visited[currentY][currentX]) {
                break;
            }

            if (graph[currentY][currentX] == 1) { // 사과가 있으면
                graph[currentY][currentX] = 0; // 사과 먹기

            } else { // 사과가 없으면 꼬리 이동
                int[] tail = snake.poll();
                visited[tail[0]][tail[1]] = false;
            }

            visited[currentY][currentX] = true;
            snake.offer(new int[]{currentY, currentX});

            if (directions.containsKey(currentTime)) {
                changeDirection(directions.get(currentTime));
            }
        }

        return currentTime;
    }

    public static void changeDirection(String direction) {
        if (direction.equals("D")) {
            currentDirection = (currentDirection + 1) % 4;

        } else if (direction.equals("L")) {
            currentDirection = (currentDirection + 3) % 4;
        }
    }
}
