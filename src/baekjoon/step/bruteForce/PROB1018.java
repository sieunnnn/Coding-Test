package baekjoon.step.bruteForce;

import java.io.*;
import java.util.*;

public class PROB1018 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N,M;
    static int[][] board;
    static int answer = 65;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];

        for (int i = 0; i < N; i++){
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = str.charAt(j) ==  'B'  ?  1  :  0; // B = 1, W = 0
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i + 7 >= N || j + 7 >= M) continue; // 범위 벗어나면 제외
                answer = Math.min(answer, Math.min(solve(i, j , 0), solve(i, j, 1)));
            }
        }
        System.out.println(answer);
    }

    public static int solve(int y, int x, int color) {
        int cnt = 0;
        int currColor = color; // 0 or 1

        for (int i = y; i < y + 8;  i++) {
            for (int j = x; j < x + 8; j++) {
                if (board[i][j] != currColor) cnt++;
                if (j != x + 7) currColor = changeColor(currColor); // 색상 뒤집기
            }
        }
        return cnt;
    }

    public static int changeColor (int color) {
        return color == 1 ? 0 : 1;
    }
}
