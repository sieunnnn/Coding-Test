package programmers.algorithmKit.hash;

import java.util.*;

class PROB04 {
    static Map<String, Integer> clothTypes = new HashMap<>();

    public int solution(String[][] clothes) {
        int answer = 1;

        for(String[] cloth : clothes) {
            if (clothTypes.containsKey(cloth[1])) {
                clothTypes.put(cloth[1], clothTypes.get(cloth[1]) + 1);
            } else {
                clothTypes.put(cloth[1], 1);
            }
        }

        for (int value : clothTypes.values()) {
            answer *= (value + 1);
        }

        return answer - 1;
    }
}
