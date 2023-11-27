package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB11724 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] graph = new int[1001][1001];
    static boolean[] visited = new boolean[1001];
    static int N, M;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i ++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] ++;
            graph[v][u] ++;
        }

        int result = 0;
        for (int i = 1; i <= N; i ++) {
            if (!visited[i]) {
                dfs(i);
                result ++;
            }
        }

        System.out.println(result);
    }

    public static void dfs(int depth) {
        if (visited[depth]) {
            return;
        }
        
        visited[depth] = true;
        for (int i = 1; i <= N; i ++) {
            if (graph[depth][i] == 1) {
                dfs(i);
            }
        }
    }
}
