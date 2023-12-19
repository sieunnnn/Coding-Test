package programmers.algorithmKit.sort;

import java.util.*;

public class PROB02 {
    public String solution(int[] numbers) {
        String[] strNumbers = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNumbers, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // 모든 숫자가 0일 경우 "0"을 반환
        if (strNumbers[0].equals("0")) {
            return "0";
        }

        return String.join("", strNumbers);
    }
}
