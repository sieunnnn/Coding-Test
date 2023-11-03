package baekjoon.step.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class PROB24479 {
    /**
     * 오름차순으로 인접 정점 방문
     * i 번 째 줄에는 정점 i 의 방문 순서를 출력한다.
     * 방문 할 수 없는 경우 0 을 출력한다.
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N, M, R;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 그래프
    static boolean[] visited; // 방문 여부 판단
    static int[] result; // 순번 저장
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
            int u = Integer.parseInt(st.nextToken()); // 정점
            int v = Integer.parseInt(st.nextToken()); // 정점

            // 양방향 간선
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 1; i <= N; i ++) {
            Collections.sort(graph.get(i));
        }

        dfs(R);

        for (int i = 1; i <= N; i ++) {
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int currentNode) {
        visited[currentNode] = true;
        result[currentNode] = cnt ++;

        for (Integer value : graph.get(currentNode)) {
            if (!visited[value]) {
                dfs(value);
            }
        }
    }
}
