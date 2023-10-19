package baekjoon.step.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB14888 {
    // +, -, *, /

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] numbers;
    static int[] operators = new int[4];
    static int N;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        numbers = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i ++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i ++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(0, numbers[0]);
        System.out.println(max);
        System.out.println(min);
    }

    public static void backTracking(int depth, int value) {
        if (depth == N - 1) {
            max = Math.max(max, value);
            min = Math.min(min, value);
        }

        for (int i = 0; i < 4; i ++) {
            if (operators[i] > 0) {
                operators[i] --;

                if (i == 0) {
                    backTracking(depth + 1, value + numbers[depth + 1]);
                } else if (i == 1) {
                    backTracking(depth + 1, value - numbers[depth + 1]);
                } else if (i == 2) {
                    backTracking(depth + 1, value * numbers[depth + 1]);
                } else {
                    backTracking(depth + 1, value / numbers[depth + 1]);
                }

                operators[i] ++;
            }
        }
    }
}
