package baekjoon.step.stackQueueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class PROB28278 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Stack<Integer> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int command;
    static int number;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            command = Integer.parseInt(st.nextToken());
            if (command == 1) {
                stack.add(Integer.parseInt(st.nextToken()));
            } else if (command == 2) {
                if (!stack.isEmpty()) {
                    sb.append(stack.pop()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (command == 3) {
                sb.append(stack.size()).append("\n");
            } else if (command == 4) {
                if (stack.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (command == 5) {
                if (!stack.isEmpty()) {
                    sb.append(stack.peek()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}
