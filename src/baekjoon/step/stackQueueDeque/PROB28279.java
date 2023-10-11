package baekjoon.step.stackQueueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class PROB28279 {
    static Deque<Integer> deque = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int command;
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            command = Integer.parseInt(st.nextToken());

            if (command == 1) {
                deque.addFirst(Integer.parseInt(st.nextToken()));

            } else if (command == 2) {
                deque.addLast(Integer.parseInt(st.nextToken()));

            } else if (command == 3) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.removeFirst()).append("\n");
                }
            } else if (command == 4) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.removeLast()).append("\n");
                }
            } else if (command == 5) {
                sb.append(deque.size()).append("\n");

            } else if (command == 6) {
                if (deque.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }

            } else if (command == 7) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.peekFirst()).append("\n");
                }

            } else if (command == 8) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.peekLast()).append("\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}
