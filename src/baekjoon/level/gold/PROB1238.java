package baekjoon.level.gold;

import java.io.*;
import java.util.*;

public class PROB1238 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<int[]>[] graph = new ArrayList[1001];
    static ArrayList<int[]>[] reverseGraph = new ArrayList[1001];
    static int[] D = new int[1001];
    static int[] reverseD = new int[1001];
    static int INF = Integer.MAX_VALUE;
    static int N, M, X;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
            reverseGraph[i] = new ArrayList<>();
            D[i] = INF;
            reverseD[i] = INF;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            graph[u].add(new int[]{v, w});
            reverseGraph[v].add(new int[]{u, w});
        }

        solveForGraph();
        solveForReverse();
        int answer = checkValue();

//        System.out.println(Arrays.toString(D));
//        System.out.println(Arrays.toString(reverseD));
        System.out.println(answer);
    }

    static void solveForGraph() {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{X, 0});

        while(!pq.isEmpty()) {
            int[] current = pq.poll();
            int currNode = current[0];
            int currCost = current[1];

            if (D[currNode] == INF || currCost < D[currNode]) {
                D[currNode] = currCost;
            } else if (D[currNode] != INF && currCost > D[currNode]) {
                continue;
            }

            for (int[] next:graph[currNode]) {
                int nextNode = next[0];
                int nextCost = next[1] + currCost;

                if (D[nextNode] == INF || nextCost < D[nextNode]) {
                    D[nextNode] = nextCost;
                    pq.add(new int[]{nextNode, nextCost});
                }
            }
        }
    }

    static void solveForReverse() {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{X, 0});

        while(!pq.isEmpty()) {
            int[] current = pq.poll();
            int currNode = current[0];
            int currCost = current[1];

            if (reverseD[currNode] == INF || currCost < reverseD[currNode]) {
                reverseD[currNode] = currCost;
            } else if (reverseD[currNode] != INF && currCost > reverseD[currNode]) {
                continue;
            }

            for (int[] next:reverseGraph[currNode]) {
                int nextNode = next[0];
                int nextCost = next[1] + currCost;

                if (reverseD[nextNode] == INF || nextCost < reverseD[nextNode]) {
                    reverseD[nextNode] = nextCost;
                    pq.add(new int[]{nextNode, nextCost});
                }
            }
        }
    }

    static int checkValue() {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, D[i] + reverseD[i]);
        }

        return max;
    }
}
