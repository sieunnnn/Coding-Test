package elice;

import java.util.*;
import java.io.*;

class Day04 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer>[] tree = new ArrayList[100001];
    static boolean[] visited = new boolean[100001];

    static int N;
    static final int FIRST_PLAYER = 1;
    static final int SECOND_PLAYER = 0;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        makeTree();

        for (int i = 1; i <= N; i++) {
            int answer = dfs(i, new int[]{0,0}, FIRST_PLAYER);
            sb.append(answer).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void makeTree() {
        int root = 1;
        visited[root] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int next : graph.get(current)) {
                if (visited[next]) continue;
                tree[current].add(next);
                visited[next] = true;
                queue.add(next);
            }
        }
    }

    public static int dfs (int node, int[] score, int player) {
        score[player] += node;
        visited[node] = true;

        int player1Score = score[FIRST_PLAYER];
        int player2Score = score[SECOND_PLAYER];

        if (graph.get(node).size() == 1) {
            if (score[FIRST_PLAYER] >= score[SECOND_PLAYER]) {
                return 1;
            }
            return 0;
        }

        int nextPlayer = player == FIRST_PLAYER ? SECOND_PLAYER : FIRST_PLAYER;
        boolean isWinPossible = false;
        for (int next : tree[node]) {
            int nextSimulation = dfs(next, score, nextPlayer);
            score[FIRST_PLAYER] = player1Score;
            score[SECOND_PLAYER] = player2Score;

            if (nextSimulation == player) {
                isWinPossible = true;
                break;
            }
        }

        return isWinPossible ? player : (player + 1) % 2;
    }
}
