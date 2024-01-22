package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB15657 {
    static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static int[] numbers;
    static int[] sequence;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        numbers = new int[N];
        sequence = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i ++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);

        backTracking(0, 0);
        System.out.println(sb.toString());
    }

    public static void backTracking(int depth, int start) {
        if (depth == M) {
            for (int i = 0; i < M; i ++) {
                sb.append(sequence[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < N; i ++) {
            sequence[depth] = numbers[i];
            backTracking(depth + 1, i);
        }
    }
}
