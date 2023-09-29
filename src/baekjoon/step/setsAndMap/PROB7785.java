package baekjoon.step.setsAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PROB7785 {
    // 회사에 남아 있는 사람 구하고 사전순의 역순으로 출력

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static HashMap<String, String> map = new HashMap<>();
    static List<String> names = new ArrayList<>();
    static int N;
    static String name;
    static String status;


    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            status = st.nextToken();

            if (map.containsKey(name)) {
                map.remove(name);
            } else {
                map.put(name, status);
            }
        }

        map.forEach((key, value) -> names.add(key));

        names.sort(Collections.reverseOrder());

        for (String name : names) {
            System.out.println(name);
        }
    }
}
