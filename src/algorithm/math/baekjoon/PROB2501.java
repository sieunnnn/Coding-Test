package algorithm.math.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PROB2501 {
    // N 의 약수들 중 K 번째로 작은 수를 출력하기

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static HashMap<Integer, Integer> map = new HashMap<>();
    static int N;
    static int K;
    static int idx;
    static int answer;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        idx = 1;
        answer = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                map.put(idx, i);
                idx++;
            }
        }

        answer = map.get(K) == null ? 0 : map.get(K);
        System.out.println(answer);
    }

}
