package programmers.kakao;

import java.util.*;

public class PROB2_2021 {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for (int i = 0; i < places.length; i ++) {
            String[] place = places[i];

            boolean isValidated = true;
            for (int j = 0; j < 5; j ++) {
                for (int k = 0; k < 5; k ++) {
                    if (place[j].charAt(k) == 'P') {
                        if (!bfs(j, k, place)) {
                            isValidated = false;
                        }
                    }
                }
            }
            answer[i] = isValidated ? 1 : 0;
        }
        return answer;
    }

    public boolean bfs(int a, int b, String[] place) {
        int[] dy = {1, -1, 0, 0}; // 위, 아래, 좌, 우
        int[] dx = {0, 0, -1, 1};

        boolean[][] visited = new boolean[5][5];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {a, b, 0});
        visited[a][b] = true;

        while (!queue.isEmpty()) {
            int[] position = queue.poll();
            int y = position[0];
            int x = position[1];
            int dist = position[2];

            if (dist > 0 && place[y].charAt(x) == 'P') {
                return false;
            }

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny >= 0 && ny < 5 && nx >= 0 && nx < 5 && !visited[ny][nx] && dist < 2) {
                    if (place[ny].charAt(nx) != 'X') {
                        queue.offer(new int[] {ny, nx, dist + 1});
                        visited[ny][nx] = true;
                    }
                }
            }
        }
        return true;
    }
}
