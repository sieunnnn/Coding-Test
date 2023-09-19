package baekjoon.step.numberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1978 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[] numbers;
    static int cnt;
    static int answer;


    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        numbers = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i ++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < numbers.length; i++) {
            cnt = 0; // 초기화
            for (int j = 1; j <= numbers[i]; j ++) {
                if (numbers[i] == 1) continue;
                if (numbers[i] % j == 0) {
                    cnt ++;
                }
            }

            if (cnt == 2) {
                answer ++;
            }
        }

        System.out.println(answer);
    }
}
