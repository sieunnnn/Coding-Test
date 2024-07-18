package gold;

import java.io.*;
import java.util.*;

public class PROB2252 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static Queue<Integer> queue = new LinkedList<>();
    static int[] count;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        count = new int[N + 1];

        init();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            count[b] ++;
        }

        topologicalSort();
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
            }
        }

        while(!queue.isEmpty()) {
            int current = queue.poll();
            sb.append(current).append(" ");

            for (int next : graph.get(current)) {
                count[next]--;

                if (count[next] == 0) queue.add(next);
            }
        }
    }
}
