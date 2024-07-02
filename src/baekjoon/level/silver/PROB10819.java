package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB10819 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[] numbers;
    static int[] sequence;
    static boolean[] used;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        numbers = new int[N];
        sequence = new int[N];
        used = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i ++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(0);
        System.out.println(max);
    }

    public static void backTracking(int depth) {
        if (depth == N) {
            solve();
            return;
        }

        for (int i = 0; i < N; i ++) {
            if (!used[i]) {
                used[i] = true;
                sequence[depth] = numbers[i];
                backTracking(depth + 1);
                used[i] = false;
            }
        }
    }

    public static void solve() {
        int temp = 0;
        System.out.println(Arrays.toString(sequence));
        for (int i = 0; i < N - 1; i ++) {
            temp += Math.abs(sequence[i] - sequence[i + 1]);
        }
        System.out.println("temp: " + temp);
        max = Math.max(temp, max);
    }
}
