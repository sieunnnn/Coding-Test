package baekjoon.step.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB15652 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[] numbers;
    static int N, M;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[M];
        backTracking(0, 0);
        System.out.println(sb);
    }

    public static void backTracking(int depth, int value) {
        if (depth == M) {
            for (int number : numbers) {
                sb.append(number).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = value; i < N; i ++) {
            numbers[depth] = i + 1;
            backTracking(depth + 1, i);
        }
    }
}
