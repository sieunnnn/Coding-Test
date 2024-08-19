package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PROB15663 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb;

    static LinkedHashSet<String> set = new LinkedHashSet<>();
    static int[] numbers;
    static int[] sequence;
    static boolean[] visited;
    static int N, M;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        numbers = new int[N];
        visited = new boolean[N];
        sequence = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);
        combination(0);
        print();
    }

    public static void combination(int depth) {
        if (depth == M) {
            sb = new StringBuilder();
            for (int value : sequence) sb.append(value).append(" ");
            set.add(sb.toString());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sequence[depth] = numbers[i];
                combination(depth + 1);
                visited[i] = false;
            }
        }
    }

    public static void print() {
        set.forEach(System.out::println);
    }
}