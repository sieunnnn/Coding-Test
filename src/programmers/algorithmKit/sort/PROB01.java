package programmers.algorithmKit.sort;

import java.util.*;

public class PROB01 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = new int[commands[i][1] - commands[i][0] + 1];
            int idx = 0;

            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                temp[idx++] = array[j];
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }

        return answer;
    }
}
