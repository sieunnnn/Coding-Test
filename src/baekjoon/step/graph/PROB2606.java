package baekjoon.step.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PROB2606 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static Queue<Integer> queue = new LinkedList<>();
    static boolean[] visited;
    static int N, M;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];

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

        bfs(1);
        System.out.println(cnt);
    }

    public static void bfs(int currentNode) {
        queue.add(currentNode);
        visited[currentNode] = true;

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(Integer value : graph.get(temp)) {
                if (!visited[value]) {
                    cnt ++;
                    visited[value] = true;
                    queue.add(value);
                }
            }
        }
    }
}
