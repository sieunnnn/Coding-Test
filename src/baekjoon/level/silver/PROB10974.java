package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB10974 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[] sequence;
    static int[] numbers;
    static boolean[] used;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        used = new boolean[N];
        numbers = new int[N];
        sequence = new int[N];
        for (int i = 0; i < N; i ++) {
            numbers[i] = i + 1;
        }

        backTracking(0);
        System.out.println(sb.toString());
    }

    public static void backTracking(int depth) {
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                sb.append(sequence[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                used[i] = true;
                sequence[depth] = numbers[i];
                backTracking(depth + 1);
                used[i] = false;
            }
        }
    }
}