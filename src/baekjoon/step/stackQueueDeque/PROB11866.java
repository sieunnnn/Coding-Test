package baekjoon.step.stackQueueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PROB11866 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> queue = new LinkedList<>();
    static int N;
    static int K;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        sb.append("<");
        int index = 0;
        while (!queue.isEmpty()) {
            index = (index + K - 1) % queue.size();
            sb.append(((LinkedList<Integer>)queue).remove(index));
            if (!queue.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");

        System.out.println(sb.toString());
    }
}
