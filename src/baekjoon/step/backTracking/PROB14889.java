package baekjoon.step.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB14889 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static boolean[] members; // 이전처럼 숫자로 받으면 숫자로 팀을 판별하는 부분이 추가되어야 한다.
    static int[][] board;
    static int startStat;
    static int linkStat;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        members = new boolean[N];

        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j ++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        combination(0, 0);
        System.out.println(min);
    }

    public static void combination(int value, int depth) {
        if(depth == N / 2) {
            min = Math.min(min, getStatDifference());
            return;
        }

        for (int i = value; i < N; i ++) {
            if (!members[i]) {
                members[i] = true;
                combination(i + 1, depth + 1);
                members[i] = false;
            }
        }
    }

    public static int getStatDifference() {
        startStat = 0;
        linkStat = 0;

        for (int i = 0; i < N; i ++) {
            for (int j = 0; j < N; j++) {
                if (members[i] && members[j]) {
                    startStat += board[i][j];
                }

                if (!members[i] && !members[j]) {
                    linkStat += board[i][j];
                }
            }
        }

        return Math.abs(startStat - linkStat);
    }
}
