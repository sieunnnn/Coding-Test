package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PROB30804 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] orgFruits;
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        orgFruits = new int[N];

        for (int i = 0; i < N; i++) {
            orgFruits[i] = Integer.parseInt(st.nextToken());
        }

        if (N == 1) {
            System.out.println(1);

        } else {
            System.out.println(findMaxLength());
        }
    }

    public static int findMaxLength() {
        int startIdx = 0, maxNumber = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int endIdx = 0; endIdx < N; endIdx++) {
            countMap.put(orgFruits[endIdx], countMap.getOrDefault(orgFruits[endIdx], 0) + 1);

            while (countMap.size() > 2) {
                countMap.put(orgFruits[startIdx], countMap.get(orgFruits[startIdx]) - 1);
                if (countMap.get(orgFruits[startIdx]) == 0) {
                    countMap.remove(orgFruits[startIdx]);
                }
                startIdx++;
            }

            maxNumber = Math.max(maxNumber, endIdx - startIdx + 1);
        }

        return maxNumber;
    }
}