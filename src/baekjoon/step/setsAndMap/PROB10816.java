package baekjoon.step.setsAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PROB10816 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static HashMap<Integer, Integer> numbers = new HashMap<>();
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i ++) {
            int temp = Integer.parseInt(st.nextToken());
            if (numbers.get(temp) == null) {
                numbers.put(temp, 1);
            } else {
                numbers.put(temp, numbers.get(temp) + 1);
            }
        }

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i ++) {
            int temp = Integer.parseInt(st.nextToken());
            if (numbers.get(temp) == null) {
                sb.append(0).append(" ");
            } else {
                sb.append(numbers.get(temp)).append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
