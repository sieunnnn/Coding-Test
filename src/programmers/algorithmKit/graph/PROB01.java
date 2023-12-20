package programmers.algorithmKit.graph;

import java.util.*;

public class PROB01 {
    public int solution(int n, int[][] edge) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] isVisited = new boolean[n + 1];
        int[] distance = new int[n + 1];
        int answer = 0;

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 그래프 그리기
        for (int[] value : edge) {
            int u = value[0];
            int v = value[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // bfs
        queue.add(1);
        isVisited[1] = true;
        distance[1] = 0;

        while(!queue.isEmpty()) {
            int currentNode = queue.poll();

            for (int nextNode : graph.get(currentNode)) {
                if (!isVisited[nextNode]) {
                    isVisited[nextNode] = true;
                    distance[nextNode] = distance[currentNode] + 1;
                    queue.add(nextNode);
                }
            }
        }

        // 최댓값 찾기
        int max = 0;
        for (int value : distance) {
            max = Math.max(value, max);
        }

        // 개수 찾기
        for (int value : distance) {
            if (value == max) {
                answer ++;
            }
        }

        return answer;
    }
}
