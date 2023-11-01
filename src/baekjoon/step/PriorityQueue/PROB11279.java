package baekjoon.step.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PROB11279 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
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

    public static void solve (int x) {
        if (x == 0) {
            if (priorityQueue.isEmpty()) {
                sb.append(0).append("\n");
            } else {
                sb.append(priorityQueue.poll()).append("\n");
            }
        } else {
            priorityQueue.offer(x);
        }
    }
}
