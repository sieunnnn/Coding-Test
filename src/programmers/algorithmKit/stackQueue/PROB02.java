package programmers.algorithmKit.stackQueue;

import java.util.*;

public class PROB02 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answers = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            int count = 0; // 초기화
            int days = (int) Math.ceil((100.0 - progresses[queue.peek()]) / speeds[queue.peek()]);

            while (!queue.isEmpty() && progresses[queue.peek()] + days * speeds[queue.peek()] >= 100) {
                queue.poll();
                count++;
            }

            if (count > 0) {
                answers.add(count);
            }

            for (int idx : queue) {
                progresses[idx] += days * speeds[idx];
            }
        }

        return answers.stream().mapToInt(i -> i).toArray();
    }
}
