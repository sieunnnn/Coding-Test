package baekjoon.level.gold;

import java.io.*;
import java.util.*;

public class PROB5972 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static int min = Integer.MAX_VALUE;
    static int[] D = new int[50001];
    static int INF = Integer.MAX_VALUE;
    static ArrayList<int[]>[] graph = new ArrayList[500001];

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
            D[i] = INF;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            graph[A].add(new int[]{B, C});
            graph[B].add(new int[]{A, C});
        }

        solve();

        System.out.println(min);
    }

    public static void solve() {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{1, 0});

        while(!pq.isEmpty()) {
            int[] current = pq.poll();
            int currNode = current[0];
            int currCost = current[1];

            if(currNode == N) { // 도착
                min = Math.min(min, D[currNode]);
                break;
            }

            if (D[currNode] == INF || currCost < D[currNode]) {
                D[currNode] = currCost;
            } else if (D[currNode] != INF && currCost > D[currNode]) {
                continue;
            }

            for (int[] next:graph[currNode]) {
                int nextNode = next[0];
                int nextCost = next[1] + currCost;

                if(D[nextNode] == INF || nextCost < D[nextNode]) {
                    D[nextNode] = nextCost;
                    pq.add(new int[]{nextNode, nextCost});
                }
            }
        }
    }
}
