package baekjoon.level.gold;

import java.io.*;
import java.util.*;

public class PROB10423 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, K;
    static int[] parent;
    static List<int[]> edges = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int powerPlant = Integer.parseInt(st.nextToken());
            parent[powerPlant] = 0;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            edges.add(new int[]{u, v, w});
        }

        System.out.println(solve());
    }

    public static int solve() {
        Collections.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));

        int sum = 0;
        for (int[] edge : edges) {
            if (find(edge[0]) != find(edge[1])) {
                merge(edge[0], edge[1]);
                sum += edge[2];
            }
        }
        return sum;
    }

    public static int find(int node) {
        if (node == parent[node]) {
            return node;
        }
        return parent[node] = find(parent[node]);
    }

    public static void merge(int u, int v) {
        int uRoot = find(u);
        int vRoot = find(v);

        if (uRoot != vRoot) {
            parent[uRoot] = vRoot;
        }
    }
}
