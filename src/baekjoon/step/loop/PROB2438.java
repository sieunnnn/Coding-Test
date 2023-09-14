package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PROB2438 {
    // 첫째 줄에는 별 1 개, 둘째 줄에는 별 2 개, N 번째 줄에는 별 N 개를 찍는 문제
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                sb.append("*");

            }
            sb.append("\n");

        }

        System.out.println(sb);

    }
}
