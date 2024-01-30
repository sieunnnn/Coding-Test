package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2529 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static String[] signs;
    static String max = "";
    static String min = "";
    static int[] sequence;
    static boolean[] used;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        signs = new String[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            signs[i] = st.nextToken();
        }

        sequence = new int[N + 1];
        used = new boolean[10];

        max = "";
        min = "";
        for (int i = 0; i <= N; i++) {
            max += "0";
            min += "9";
        }

        backTracking(0);

        System.out.println(max);
        System.out.println(min);
    }

    public static void backTracking(int depth) {
        if (depth == N + 1) {
            if (checkTrueOrFalse()) {
                StringBuilder numStr = new StringBuilder();
                for (int i = 0; i < sequence.length; i++) {
                    numStr.append(sequence[i]);
                }

                if (numStr.toString().compareTo(max) > 0) {
                    max = numStr.toString();
                }

                if (numStr.toString().compareTo(min) < 0) {
                    min = numStr.toString();
                }
            }
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (!used[i]) {
                used[i] = true;
                sequence[depth] = i;
                backTracking(depth + 1);
                used[i] = false;
            }
        }
    }

    public static boolean checkTrueOrFalse() {
        for (int i = 0; i < N; i++) {
            if (signs[i].equals("<") && sequence[i] >= sequence[i + 1]) {
                return false;
            }
            if (signs[i].equals(">") && sequence[i] <= sequence[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
