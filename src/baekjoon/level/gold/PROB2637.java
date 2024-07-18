package gold;

import java.io.*;
import java.util.*;

public class PROB2637 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
    static Queue<Integer> queue = new LinkedList<>();
    static boolean[] isOrigin;
    static int[] count;
    static int[] answers;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        count = new int[N + 1];
        isOrigin = new boolean[N + 1];
        answers = new int[N + 1];

        init();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            graph.get(X).add(new int[]{Y, K});
            isOrigin[X] = true;
            count[Y]++;
        }

        topologicalSort();
        print();

        System.out.println(sb.toString());
    }

    public static void init() {
        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public static void topologicalSort() {
        for (int i = 1; i <= N; i++) {
            if (count[i] == 0) {
                queue.add(i);
                answers[i] = 1; // 기본 부품은 자기 자신을 1개 필요로 함
            }
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int[] next : graph.get(current)) {
                int nextNumber = next[0];
                int nextCount = next[1];

                count[nextNumber]--;

                if (count[nextNumber] == 0) {
                    queue.add(nextNumber);
                }

                answers[nextNumber] += answers[current] * nextCount;
            }
        }
    }

    public static void print() {
        for (int i = 1; i <= N; i++) {
            if (count[i] == 0 && !isOrigin[i]) { // 기본 부품만 출력
                sb.append(i).append(" ").append(answers[i]).append("\n");
            }
        }
    }
}
