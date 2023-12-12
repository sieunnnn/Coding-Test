package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PROB9375 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int T, N;
    static Map<String, Integer> type;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i ++) {
            N = Integer.parseInt(br.readLine());
            type = new HashMap<>();
            int result = 1;

            for(int j = 0; j < N; j ++) {
                String[] temp = br.readLine().split(" ");

                if (type.containsKey(temp[1])) {
                    type.put(temp[1], type.get(temp[1]) + 1);
                } else {
                    type.put(temp[1], 1);
                }
            }

            for (int value : type.values()) {
                result *= (value + 1); // 안 입는 경우를 고려 해야 합니다.
            }
            System.out.println(result - 1); // 알몸인 상태를 제외해 주어야 합니다.
        }
    }
}
