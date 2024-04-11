package baekjoon.level.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PROB1922 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static List<int[]> edges = new ArrayList<>();
    static int[] parent = new int[1001];
    static int N, M;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            edges.add(new int[]{u, v, w});
        }

        solve();
    }

    public static void solve() {
        int sum = 0;

        // 가중치를 기준으로 정렬
        Collections.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));
        init();

        for (int[] edge : edges) {
            if (find(edge[0]) != find(edge[1])) {
                merge(edge[0], edge[1]);
                sum += edge[2];
            }
        }

        System.out.println(sum);
    }

    public static void init() {
        for (int i = 0; i <= N; i++) {
            parent[i] = i;
        }
    }

    public static int find(int node) {
        int p = parent[node];
        if (parent[p] == p) {
            return p;
        }
        return parent[node] = find(parent[p]);
    }

    public static void merge(int u, int v) {
        int uRoot = parent[u];
        int vRoot = parent[v];

        if (uRoot != vRoot) {
            parent[vRoot] = uRoot;
        }
    }
}
