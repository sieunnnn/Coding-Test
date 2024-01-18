package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PROB3085 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static String[][] graph;

    public static void main(String[] args) throws IOException {
        // 그래프 생성
        N = Integer.parseInt(br.readLine());
        graph = new String[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                graph[i][j] = String.valueOf(line.charAt(j));
            }
        }
        System.out.println(solve());
    }

    public static int solve() {
        int maxCandies = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 마지막 열 제외 옆으로 swap
                if (j < N - 1) {
                    swap(i, j, i, j + 1);
                    maxCandies = Math.max(maxCandies, getMaxCandies());
                    swap(i, j, i, j + 1); // 초기화
                }

                // 마지막 행 제외 위 아래로 swap
                if (i < N - 1) {
                    swap(i, j, i + 1, j);
                    maxCandies = Math.max(maxCandies, getMaxCandies());
                    swap(i, j, i + 1, j); // 초기화
                }
            }
        }
        return maxCandies;
    }

    public static void swap(int x1, int y1, int x2, int y2) {
        String temp = graph[x1][y1];
        graph[x1][y1] = graph[x2][y2];
        graph[x2][y2] = temp;
    }

    public static int getMaxCandies() {
        int maxCount = 0;
        for (int i = 0; i < N; i++) {
            maxCount = Math.max(maxCount, checkRow(i));
            maxCount = Math.max(maxCount, checkColumn(i));
        }
        return maxCount;
    }

    public static int checkColumn(int x) {
        int cnt = 1, maxCnt = 1;
        for (int i = 1; i < N; i++) {
            if (graph[i][x].equals(graph[i - 1][x])) {
                cnt++;
                maxCnt = Math.max(maxCnt, cnt);
            } else {
                cnt = 1; // 초기화
            }
        }
        return maxCnt;
    }

    public static int checkRow(int y) {
        int cnt = 1, maxCnt = 1;
        for (int i = 1; i < N; i++) {
            if (graph[y][i].equals(graph[y][i - 1])) {
                cnt++;
                maxCnt = Math.max(maxCnt, cnt);
            } else {
                cnt = 1; // 초기화
            }
        }
        return maxCnt;
    }
}
