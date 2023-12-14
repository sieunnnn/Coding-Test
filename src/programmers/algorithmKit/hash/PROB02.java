package programmers.algorithmKit.hash;
import java.util.*;

public class PROB02 {
    static Set<Integer> numbers = new HashSet<>();

    public int solution(int[] nums) {
        int answer = 0;

        for (int num : nums) {
            numbers.add(num);
        }

        int numbersSize = numbers.size();
        int selectValue = nums.length / 2;

        if (selectValue >= numbersSize) {
            answer = numbersSize;
        } else {
            answer = selectValue;
        }

        return answer;
    }
}

