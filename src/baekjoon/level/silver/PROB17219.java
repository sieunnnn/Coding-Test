package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PROB17219 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static Map<String, String> map = new HashMap<>();
    static int N, M;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i ++) {
            String[] temp = br.readLine().split(" ");
            map.put(temp[0], temp[1]);
        }

        for (int i = 0; i < M; i ++) {
            String key = br.readLine();
            sb.append(map.get(key)).append("\n");
        }

        System.out.println(sb.toString());
    }
}
