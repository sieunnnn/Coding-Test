package baekjoon.level.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB16202 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[][] graph = new int[10001][2];
    static int[] parent = new int[1001];
    static int N; // 노드 수
    static int M; // 간선의 개수
    static int K; // 턴의 수
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        // init
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[i][0] = x;
            graph[i][1] = y;
        }

        for (int i = 1; i <= K; i++) {
            int value = solve(i);
            sb.append(value).append(" ");
        }

        System.out.println(sb.toString());
    }

    public static int solve(int startIdx) {
        int sum = 0;
        int cnt = 0;
        init();

        for (int i = startIdx; i <= M; i++) {
            if (cnt == N - 1) {
                break;
            }

            int uRoot = find(graph[i][0]);
            int vRoot = find(graph[i][1]);

            if (uRoot != vRoot) {
                merge(uRoot, vRoot);
                sum += i;
                cnt++;
            }
        }

        return cnt == N - 1 ? sum : 0;
    }

    public static void init() {
        for (int i = 0; i <= N; i ++) {
            parent[i] = i;
        }
    }

    public static int find(int node) {
        int p = parent[node];
        if (parent[p] == p) {
            return p;
        }
        return parent[node] = find(parent[p]); // 갱신
    }

    public static void merge(int u, int v) {
        int uRoot = parent[u];
        int vRoot = parent[v];

        if (uRoot != vRoot) {
            parent[vRoot] = uRoot;
        }
    }
}
