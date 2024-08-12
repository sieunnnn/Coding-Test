package gold;

import java.io.*;
import java.util.*;

public class PROB1976 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int M;
    static int[] parent;
    static int[] order;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        parent = new int[N + 1];
        order = new int[N];

        init();

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= N; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if (temp == 1) union(i, j);
            }
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());

        for (int i = 1; i < M; i++) {
            int now = Integer.parseInt(st.nextToken());
            if (parent[start] != parent[now]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

    public static void init() {
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }
    }

    public static int find(int node) {
       if (parent[node] == node) return node;
       else return parent[node] = find(parent[node]);
    }

    public static void union(int node1, int node2) {
        node1 = find(node1);
        node2 = find(node2);

        if (node1 > node2) parent[node1] = node2;
        else parent[node2] = node1;
    }
}
