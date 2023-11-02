package baekjoon.step.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PROB10816 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static Map<Integer, Integer> values = new HashMap<>();
    static int N, M;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i ++) {
            int temp = Integer.parseInt(st.nextToken());
            if(values.containsKey(temp)) {
                values.put(temp, values.get(temp) + 1);
            } else {
                values.put(temp, 1);
            }
        }

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i ++) {
            int temp = Integer.parseInt(st.nextToken());
            if (values.get(temp) == null) {
                sb.append(0);
            } else {
                sb.append(values.get(temp));
            }

            if (i != M - 1) {
                sb.append(" ");
            }
        }

        System.out.println(sb);
    }
}
