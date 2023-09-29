package baekjoon.step.setsAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class PROB1620 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static HashMap<String, String> map1 = new HashMap<>();
    static HashMap<String, String> map2 = new HashMap<>();
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;

    public static void main (String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N + M; i++) {
            if (i < N) {
                String temp = br.readLine();
                map1.put(temp, String.valueOf(i + 1));
                map2.put(String.valueOf(i + 1), temp);
            } else {
                String temp = br.readLine();
                if (temp.charAt(0) >= '1' && temp.charAt(0) <= '9') {
                    sb.append(map2.get(temp)).append("\n");
                } else {
                    sb.append(map1.get(temp)).append("\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}
