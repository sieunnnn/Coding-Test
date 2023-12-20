package programmers.algorithmKit.sort;

import java.util.*;

public class PROB03 {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i; // 최댓값을 찾아야 하므로 끝에서 부터 세기

            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }
}
