package silver;

import java.io.*;
import java.util.*;

public class PROB11725 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static List<Integer>[] graph;
    static boolean[] visited;
    static int[] parent;
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        graph = new ArrayList[N + 1];
        parent = new int[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        solve(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
    }

    public static void solve(int current) {
        visited[current] = true;

        for (int node : graph[current]) {
            if (!visited[node]) {
                parent[node] = current;
                solve(node);
            }
        }
    }
}
