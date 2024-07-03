package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB16564 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int K;
    static int[] levels;
    static int result;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        levels = new int[N];

        for (int i = 0; i < N; i++) {
            levels[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(levels);
        result = levels[0];
        solve(levels[0], levels[N - 1] + K);
        System.out.println(result);
    }

    public static void solve(int min, int max) {
        if (min > max) {
            return;
        }

        int middle = (max + min) / 2;
        long sum = 0;

        for (int level : levels) {
            if(level < middle) sum += (middle - level);
        }

        if(sum <= K) {
            result = middle;
            solve(middle + 1, max);
        }
        else solve(min, middle - 1);
    }
}
