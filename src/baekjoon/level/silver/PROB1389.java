package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PROB1389 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<ArrayList<Integer>> graphs = new ArrayList<>();
    static int N, M;
    static int[] current;
    static int[] numbers;
    static int[] kevins;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        current = new int[N];
        init();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            graphs.get(u).add(v);
            graphs.get(v).add(u);
        }

        solve();
    }

    public static void init() {
        for (int i = 0; i < N; i++) {
            graphs.add(new ArrayList<>());
        }

        for (int i = 0; i < N; i++) {
            current[i] = i;
        }
    }

    public static void solve() {
        kevins = new int[N];
        for (int i = 0; i < N; i++) {
            kevins[i] = bfs(current[i]);
        }

        int minValue = Integer.MAX_VALUE;
        int person = 0;
        for (int i = 0; i < N; i++) {
            if (kevins[i] < minValue) {
                minValue = kevins[i];
                person = i + 1;
            }
        }
        System.out.println(person);
    }

    public static int bfs(int start) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0});
        numbers = new int[N];
        visited = new boolean[N];
        visited[start] = true;

        int sum = 0;
        while (!queue.isEmpty()) {
            int[] currentStatus = queue.poll();
            int currentNode = currentStatus[0];
            int currentDepth = currentStatus[1];

            sum += currentDepth;

            for (int nextNode : graphs.get(currentNode)) {
                if (!visited[nextNode]) {
                    visited[nextNode] = true;
                    queue.add(new int[]{nextNode, currentDepth + 1});
                }
            }
        }
        return sum;
    }
}
