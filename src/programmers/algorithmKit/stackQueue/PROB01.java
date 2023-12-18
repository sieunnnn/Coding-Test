package programmers.algorithmKit.stackQueue;

import java.util.*;

public class PROB01 {
    static Queue<Integer> queue = new LinkedList<>();
    static List<Integer> answer = new ArrayList<>();

    public int[] solution(int []arr) {
        int lastAdded = arr[0];
        queue.add(arr[0]);

        for (int number : arr) {
            if (lastAdded != number) {
                queue.add(number);
                lastAdded = number;
            }
        }

        while(!queue.isEmpty()) {
            answer.add(queue.poll());
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
