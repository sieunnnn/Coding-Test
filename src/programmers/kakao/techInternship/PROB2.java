package programmers.kakao.techInternship;

import java.util.*;

public class PROB2 {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;
        answer = solve(queue1, queue2);
        return answer;
    }

    public int solve(int[] queue1, int[] queue2) {
        long sum1 = 0;
        long sum2 = 0;

        Queue<Integer> que1 = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();

        for (int number : queue1) {
            que1.add(number);
            sum1 += number;
        }

        for (int number : queue2) {
            que2.add(number);
            sum2 += number;
        }

        if ((sum1 + sum2) % 2 != 0) {
            return -1;
        }

        int cnt = 0;
        while (sum1 != sum2) {
            cnt ++;

            if (sum1 > sum2) {
                int poll = que1.poll();
                sum1 -= poll;
                sum2 += poll;
                que2.offer(poll);

            } else if (sum1 < sum2) {
                int poll = que2.poll();
                sum2 -= poll;
                sum1 += poll;
                que1.offer(poll);
            }

            if (cnt > (queue1.length + queue2.length) * 2) return -1;
        }

        return cnt;
    }
}
