package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB14888 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[] numbers;
    static int[] operators = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        numbers = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, numbers[0]);

        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int depth, int sum) {
        if (depth == N -1) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);
        }

        // 덧셈, 뺄셈, 곱셈, 나눗셈
        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;

                if (i == 0) {
                    dfs(depth + 1, sum + numbers[depth + 1]);

                } else if (i == 1) {
                    dfs(depth + 1, sum - numbers[depth + 1]);

                } else if (i == 2) {
                    dfs(depth + 1, sum * numbers[depth + 1]);

                } else {
                    dfs(depth + 1, sum / numbers[depth + 1]);
                }

                operators[i]++;
            }
        }
    }
}
