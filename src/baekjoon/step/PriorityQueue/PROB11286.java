package baekjoon.step.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PROB11286 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(
            (o1, o2) -> {
                if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 > o2 ? 1 : -1; // -1 을 주면 더 높은 우선 순위가 된다.
                } else {
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
    );

    static int N;
    static int x;

    public static void main(String[] args) {
        N = sc.nextInt();
        for (int i = 0; i < N; i ++) {
            x = sc.nextInt();
            solve(x);
        }
        System.out.println(sb);
    }

    public static void solve(int x) {
        if (x == 0) {
            if (priorityQueue.isEmpty()) {
                sb.append(0).append("\n");
            } else {
                sb.append(priorityQueue.poll()).append("\n");
            }
        } else {
            priorityQueue.add(x);
        }
    }
}
