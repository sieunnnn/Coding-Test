package baekjoon.level.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class PROB1753 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int V;
    static int E;
    static int K;
    static ArrayList<int[]>[] list = new ArrayList[20001];
    static int[] D = new int[20001];
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());

        // init
        for (int i = 0; i <= V; i++) {
            list[i] = new ArrayList<>();
            D[i] = INF;
        }

        // 그래프 생성
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken()); // node
            int w = Integer.parseInt(st.nextToken()); // cost

            list[u].add(new int[]{v, w});
        }

        solve();

        // print
        for (int i = 1; i <= V; i++) {
            if (K == i) {
                sb.append(0);
            } else if (D[i] == INF) {
                sb.append("INF");
            } else {
                sb.append(D[i]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void solve() {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        pq.add(new int[]{K, 0});

        while(!pq.isEmpty()) {
            int[] current = pq.poll();
            int currNode = current[0];
            int currCost = current[1];

            if (D[currNode] == INF || currCost < D[currNode]) {
                D[currNode] = currCost;
            } else if (D[currNode] != INF && currCost > D[currNode]) {
                continue;
            }

            for (int[] next:list[currNode]) {
                int nextNode = next[0];
                int nextCost = next[1] + currCost;

                if (D[nextNode] == INF || nextCost < D[nextNode]) {
                    D[nextNode] = nextCost;
                    pq.add(new int[]{nextNode, nextCost}); // 유망한 값 -> pq
                }
            }
        }
    }
}
