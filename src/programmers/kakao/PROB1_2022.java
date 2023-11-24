package programmers.kakao;

import java.util.*;

public class PROB1_2022 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        answer = solve(survey, choices);
        return answer;
    }

    public String solve(String[] surveys, int[] choices) {
        int[] values = {3, 2, 1, 0, 1, 2, 3};
        String answer = "";

        Map<Character, Integer> scores = new HashMap<>();
        scores.put('R', 0);
        scores.put('T', 0);
        scores.put('C', 0);
        scores.put('F', 0);
        scores.put('J', 0);
        scores.put('M', 0);
        scores.put('A', 0);
        scores.put('N', 0);

        for (int i = 0; i < surveys.length; i++) {
            int choiceValue = values[choices[i] - 1];
            char firstChar = surveys[i].charAt(0);
            char secondChar = surveys[i].charAt(1);

            if (choices[i] < 4) {
                scores.put(firstChar, scores.getOrDefault(firstChar, 0) + choiceValue);
            } else if (choices[i] > 4) {
                scores.put(secondChar, scores.getOrDefault(secondChar, 0) + choiceValue);
            }
        }

        answer += (scores.get('R') >= scores.get('T')) ? "R" : "T";
        answer += (scores.get('C') >= scores.get('F')) ? "C" : "F";
        answer += (scores.get('J') >= scores.get('M')) ? "J" : "M";
        answer += (scores.get('A') >= scores.get('N')) ? "A" : "N";

        return answer;

    }
}
