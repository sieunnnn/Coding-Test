package baekjoon.step.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PROB1260 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N, M, R;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static Queue<Integer> queue = new LinkedList<>();
    static boolean[] dfsVisited;
    static boolean[] bfsVisited;
    static int dfsCnt = 1;
    static int bfsCnt = 1;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        dfsVisited = new boolean[N + 1];
        bfsVisited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        dfs(R);
        sb.append("\n");
        bfs(R);
        System.out.println(sb);
    }

    public static void bfs(int startNode) {
        queue.add(startNode);
        bfsVisited[startNode] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            sb.append(currentNode).append(" ");

            for (int nextNode : graph.get(currentNode)) {
                if (!bfsVisited[nextNode]) {
                    bfsVisited[nextNode] = true;
                    queue.add(nextNode);
                }
            }
        }
    }

    public static void dfs(int startNode) {
        dfsVisited[startNode] = true;
        sb.append(startNode).append(" ");

        for (Integer nextNode : graph.get(startNode)) {
            if (!dfsVisited[nextNode]) {
                dfs(nextNode);
            }
        }
    }
}
