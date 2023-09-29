package baekjoon.step.setsAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PROB1764 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static HashMap<String, Integer> map = new HashMap<>();
    static List<String> names = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N + M; i ++) {
            if (i < N) {
                map.put(br.readLine(), 1);
            } else {
                String temp = br.readLine();
                if (map.get(temp) != null) {
                    names.add(temp);
                }
            }
        }

        sb.append(names.size()).append("\n");

        Collections.sort(names);

        for (String name : names) {
            sb.append(name).append("\n");
        }

        System.out.println(sb.toString());
    }
}
