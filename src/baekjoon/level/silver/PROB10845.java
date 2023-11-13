package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PROB10845 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> queue = new LinkedList<>();
    static int N;
    static String command;
    static int number;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            command = st.nextToken();

            if (command.equals("push")) {
                number = Integer.parseInt(st.nextToken());
                queue.add(number);

            } else if (command.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");;
                }
            } else if (command.equals("size")) {
                sb.append(queue.size()).append("\n");

            } else if (command.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            }  else if (command.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
            }  else if (command.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(((LinkedList<Integer>)queue).getLast()).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
