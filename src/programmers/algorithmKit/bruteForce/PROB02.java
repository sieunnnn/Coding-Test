package programmers.algorithmKit.bruteForce;

import java.util.*;

public class PROB02 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] values = new int[3];

        values[0] = solve(answers, student1);
        values[1] = solve(answers, student2);
        values[2] = solve(answers, student3);

        int max = 0;
        for (int value : values) {
            max = Math.max(max, value);
        }

        List<Integer> results = new ArrayList<>();

        for(int i = 0; i < values.length; i ++) {
            if (values[i] == max) {
                results.add(i + 1);
            }
        }

        return results.stream().mapToInt(i -> i).toArray();
    }

    public static int solve(int[] answers, int[] student) {
        int idx = 0;
        int cnt = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student[idx]) {
                cnt++;
            }

            idx++;
            if (idx == student.length) {
                idx = 0;
            }
        }
        return cnt;
    }
}
