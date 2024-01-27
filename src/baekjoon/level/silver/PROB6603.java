package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB6603 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[] numbers;
    static int[] sequnece;
    static boolean[] used;

    public static void main(String[] args) throws IOException {
        while(true) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            if (N == 0) {
                break;
            }

            numbers = new int[N];
            used = new boolean[N];
            sequnece = new int[6];

            for (int i = 0; i < N; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(numbers);
            backTracking(0, 0, N);
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void backTracking(int depth, int start, int N) { // 중복 제거
        if (depth == 6) {
            for (int i = 0; i < 6; i ++) {
                sb.append(sequnece[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < N; i ++) {
            if (!used[i]) {
                used[i] = true;
                sequnece[depth] = numbers[i];
                backTracking(depth + 1, i + 1, N);
                used[i] = false;
            }
        }
    }
}
