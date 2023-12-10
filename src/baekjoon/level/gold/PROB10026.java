package baekjoon.level.gold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PROB10026 {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static String[][] graph;
    static String[][] blindGraph;
    static boolean[][] visited;
    static boolean[][] blindvisited;
    static Queue<int[]> blindNodes = new LinkedList<>();
    static Queue<int[]> nodes = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int cnt1 = 0;
    static int cnt2 = 0;

    public static void main(String[] args) {
        N = sc.nextInt();
        graph = new String[N][N];
        blindGraph = new String[N][N];
        visited = new boolean[N][N];
        blindvisited = new boolean[N][N];

        for (int i = 0; i < N; i ++) {
            String[] temp = sc.next().split("");
            for (int j = 0; j < graph.length; j ++) {
                graph[i][j] = temp[j];

                if (graph[i][j].equals("G")) {
                    blindGraph[i][j] = "R";
                } else {
                    blindGraph[i][j] = graph[i][j];
                }
            }
        }

        for(int i = 0; i < N; i ++) {
            for (int j = 0; j < N; j ++) {
                if (!blindvisited[i][j]) {
                    cnt1 ++;
                    isColorBlind(i, j);
                }
                if (!visited[i][j]) {
                    cnt2++;
                    isNotColorBlind(i, j);
                }
            }
        }

        System.out.println(cnt2 + " " + cnt1);
    }

    public static void isColorBlind(int y, int x ) {
        blindNodes.add(new int[] {y, x});
        blindvisited[y][x] = true;

        while (!blindNodes.isEmpty()) {
            int[] startNode = blindNodes.poll();
            int startY = startNode[0];
            int startX = startNode[1];

            for (int i = 0; i < 4; i ++) {
                int nextY = startY + dy[i];
                int nextX = startX + dx[i];

                if (nextY >= 0 && nextY < N && nextX >= 0 && nextX < N  && !blindvisited[nextY][nextX]) {
                    if (blindGraph[startY][startX].equals(blindGraph[nextY][nextX])) {
                        blindNodes.add(new int[] {nextY, nextX});
                        blindvisited[nextY][nextX] = true;
                    }
                }
            }
        }
    }

    public static void isNotColorBlind(int y, int x ) {
        nodes.add(new int[] {y, x});
        visited[y][x] = true;

        while (!nodes.isEmpty()) {
            int[] startNode = nodes.poll();
            int startY = startNode[0];
            int startX = startNode[1];

            for (int i = 0; i < 4; i ++) {
                int nextY = startY + dy[i];
                int nextX = startX + dx[i];

                if (nextY >= 0 && nextY < N && nextX >= 0 && nextX < N && !visited[nextY][nextX]) {
                    if (graph[startY][startX].equals(graph[nextY][nextX])) {
                        nodes.add(new int[] {nextY, nextX});
                        visited[nextY][nextX] = true;
                    }
                }
            }
        }
    }
}
