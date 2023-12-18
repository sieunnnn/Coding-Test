package programmers.algorithmKit.stackQueue;

import java.util.*;

public class PROB04 {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            // 프로세스의 인덱스와 우선순위를 함께 큐에 저장
            queue.add(new int[]{i, priorities[i]});
        }

        Arrays.sort(priorities);
        int order = 0;
        int maxIndex = priorities.length - 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            if (current[1] == priorities[maxIndex - order]) {
                order++;
                if (current[0] == location) {
                    return order;
                }
            } else {
                queue.add(current);
            }
        }

        return -1;
    }
}
