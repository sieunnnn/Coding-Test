package baekjoon.step.stackQueueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PROB2346 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static Deque<int[]> deque = new ArrayDeque<>();
    static int N;
    static int currNum;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i ++) {
            int temp = Integer.parseInt(st.nextToken());
            deque.add(new int[] {(i + 1), temp});
        }

        while (deque.size() > 1) {
            int[] tempArr = deque.poll();
            sb.append(tempArr[0]).append(" ");
            currNum = tempArr[1];

            if (currNum > 0) {
                for (int i = 0; i < currNum - 1; i ++) {
                    deque.add(deque.poll());
                }
            } else {
                for (int i = 0; i < -(currNum); i ++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        sb.append(deque.poll()[0]);
        System.out.println(sb.toString());
    }
}
