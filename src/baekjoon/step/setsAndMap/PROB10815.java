package baekjoon.step.setsAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PROB10815 {
    // 첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0을 공백으로 구분해 출력한다.

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static HashMap<Integer, Integer> map = new HashMap<>();
    static int M;
    static int[] cards;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i  = 0; i < N; i ++) {
            map.put(Integer.parseInt(st.nextToken()),1);
        }

        M = Integer.parseInt(br.readLine());
        cards = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i ++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        for (int card : cards) {
            answer = map.get(card) == null ? 0 : 1;
            sb.append(answer).append(" ");
        }

        System.out.println(sb.toString());
    }
}
