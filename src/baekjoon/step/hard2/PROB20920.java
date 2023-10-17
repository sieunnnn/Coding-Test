package baekjoon.step.hard2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PROB20920 {
    // 길이가 m 이상인 단어만 외울거임

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N, M;
    static int idx = 0;

    static Map<String, Integer> map = new HashMap<>();
    static String[] words;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            if (temp.length() < M) continue;
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        words = new String[map.size()];
        for (String word : map.keySet()) {
            words[idx ++] = word;
        }

        Arrays.sort(words, (o1, o2) -> {
            if (map.get(o1) == map.get(o2)) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치
                }
                return o2.length() - o1.length(); // 단어의 길이가 길수록 앞에 배치
            }
            return map.get(o2) - map.get(o1); // 자주 나오는 단어일 수록 앞에 배치
        });

        for (String word : words) {
            sb.append(word).append("\n");
        }

        System.out.println(sb.toString());
    }
}