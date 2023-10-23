package baekjoon.step.backTracking;

import java.util.Scanner;

public class PROB9663 {
    static Scanner sc = new Scanner(System.in);
    static int[] column;
    static int N;
    static int cnt;

    public static void main(String[] args) {
        N = sc.nextInt();
        column = new int[N];

        backTracking(0);
        System.out.println(cnt);
    }

    public static void backTracking(int depth) {
        if (depth == N) {
            cnt++;
            return;
        }

        for (int i = 0; i < N; i++) { // 검사할 행
            column[depth] = i;
            if (isPossible(depth)) {
                backTracking(depth + 1);
            }
        }
    }

    public static boolean isPossible (int current) { // 열 검사
        for (int i = 0; i < current; i++) {
            if (column[i] == column[current] || Math.abs(column[i] - column[current]) == current - i) {
                return false;
            }
        }
        return true;
    }

}
