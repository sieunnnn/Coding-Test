package baekjoon.step.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PROB24445 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static Queue<Integer> queue = new LinkedList<>();
    static int N, M, R;
    static boolean[] visited;
    static int[] result;
    static int cnt = 1;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        result = new int[N + 1];

        for (int i = 0; i <= N; i ++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i ++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 1; i <= N; i ++) {
            graph.get(i).sort(Collections.reverseOrder());
        }

        bfs(R);

        for (int i = 1; i <= N; i ++) {
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);
    }

    public static void bfs (int currentNode) {
        queue.add(currentNode);
        visited[currentNode] = true;
        result[currentNode] = cnt ++;

        while(!queue.isEmpty()) {
            int current = queue.poll();
            for (int value : graph.get(current)) {
                if (!visited[value]) {
                    visited[value] = true;
                    result[value] = cnt ++;
                    queue.add(value);
                }
            }
        }
    }
}
