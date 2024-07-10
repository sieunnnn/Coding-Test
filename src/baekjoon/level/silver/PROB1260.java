package silver;

import java.io.*;
import java.util.*;

public class PROB1260 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static Queue<Integer> queue = new LinkedList<>();
    static boolean[] visited;
    static int N, M, V;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        visited = new boolean[N +1];
        solveUsingDFS(V);

        visited = new boolean[N + 1];
        solveUsingBFS(V);

        System.out.println(sb.toString());
    }

    public static void solveUsingDFS(int startNode) {
        visited[startNode] = true;
        sb.append(startNode).append(" ");

        for (int nextNode : graph.get(startNode)) {
            if (!visited[nextNode]) {
                solveUsingDFS(nextNode);
            }
        }
    }

    public static void solveUsingBFS(int startNode) {
        sb.append("\n");
        visited[startNode] = true;
        queue.add(startNode);

        while(!queue.isEmpty()) {
            int currentNode = queue.poll();
            sb.append(currentNode).append(" ");

            for (int nextNode : graph.get(currentNode)) {
                if (!visited[nextNode]) {
                    visited[nextNode] = true;
                    queue.add(nextNode);
                }
            }
        }
    }
}
