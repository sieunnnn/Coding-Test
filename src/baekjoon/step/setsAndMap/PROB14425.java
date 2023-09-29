package baekjoon.step.setsAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PROB14425 {

    /**
     * 첫째 줄에 문자열의 개수 N과 M (1 ≤ N ≤ 10,000, 1 ≤ M ≤ 10,000)이 주어진다.
     * 다음 N개의 줄에는 집합 S에 포함되어 있는 문자열들이 주어진다.
     * 다음 M개의 줄에는 검사해야 하는 문자열들이 주어진다.
     *
     * 첫째 줄에 M개의 문자열 중에 총 몇 개가 집합 S에 포함되어 있는지 출력한다.
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int M;
    static String[] words;
    static HashMap<String,Integer> map = new HashMap<>();
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        words = new String[M];

        for (int i = 0; i < N + M; i ++) {
            if (i < N) {
                map.put(br.readLine(), 1);
            } else {
                words[i - N] = br.readLine();
            }
        }

        for (String word : words) {
            if (map.get(word) != null) {
                answer ++;
            }
        }

        System.out.println(answer);
    }
}
