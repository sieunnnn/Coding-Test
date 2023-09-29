package baekjoon.step.setsAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PROB1269 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static HashMap<Integer, String> HashA = new HashMap<>();
    static HashMap<Integer, String> HashB = new HashMap<>();
    static int A;
    static int B;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i ++) {
            HashA.put(Integer.parseInt(st.nextToken()), "A");
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i ++) {
            HashB.put(Integer.parseInt(st.nextToken()), "B");
        }

        HashA.forEach((key, value) -> {
            if (HashB.get(key) == null) {
                answer ++;
            }
        });

        HashB.forEach((key, value) -> {
            if (HashA.get(key) == null) {
                answer ++;
            }
        });

        System.out.println(answer);
    }
}
