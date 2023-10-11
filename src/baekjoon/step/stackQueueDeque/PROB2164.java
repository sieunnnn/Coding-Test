package baekjoon.step.stackQueueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class PROB2164 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Queue<Integer> queue = new LinkedList<>();
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i ++) {
            queue.add(i + 1);
        }

        while (queue.size() != 1) {
            // 카드 버리기
            queue.poll();

            // 맨 위 카드 아래로
            int temp = queue.poll();
            queue.add(temp);
        }

        System.out.println(queue.poll());
    }
}
