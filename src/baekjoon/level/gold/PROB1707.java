package gold;

import java.io.*;
import java.util.*;

public class PROB1707 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] colors;
    static int K;

    public static void main(String[] args) throws IOException {
        K = Integer.parseInt(br.readLine());
        for (int k = 0; k < K; k++) {
            graph = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            colors = new int[V + 1];

            for (int i = 0; i < V + 1; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph.get(u).add(v);
                graph.get(v).add(u);

            }

            boolean isBipartite = true;
            for (int i = 1; i <= V; i++) {
                if (colors[i] == 0) {
                    if (!solve(i)) {
                        isBipartite = false;
                        break;
                    }
                }
            }

            if (isBipartite) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean solve(int current) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(current);
        colors[current] = 1;

        while(!queue.isEmpty()) {
            current = queue.poll();

            for (int neighbor : graph.get(current)) {
                if (colors[neighbor] == 0) {
                    colors[neighbor] = -colors[current];
                    queue.add(neighbor);

                } else if (colors[neighbor] == colors[current]) {
                    return false;
                }
            }
        }
        return true;
    }
}
