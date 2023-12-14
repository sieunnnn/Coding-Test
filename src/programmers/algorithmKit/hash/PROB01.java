package programmers.algorithmKit.hash;
import java.util.*;

public class PROB01 {
    static Map<String, Integer> map = new HashMap<>();
    static String answer = "";

    public String solution(String[] participants, String[] completions) {

        for (String participant : participants) {
            map.put(participant, map.getOrDefault(participant, 0) + 1);
        }

        for (String completion : completions) {
            map.put(completion, map.get(completion) - 1);
            if (map.get(completion) == 0) {
                map.remove(completion);
            }
        }

        for (String participant : participants) {
            if (map.containsKey(participant)) {
                answer = participant;
                break;
            }
        }

        return answer;
    }
}

