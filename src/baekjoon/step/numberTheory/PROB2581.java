package baekjoon.step.numberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB2581 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int M;
    static int[] numbers;
    static int cnt;
    static int sum;
    static int min;


    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        numbers = new int[M - N + 1];
        for (int i = 0; i < numbers.length; i ++) {
            numbers[i] = N ++;
        }

        min = 0;
        sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            cnt = 0; // 초기화
            for (int j = 1; j <= numbers[i]; j ++) {
                if (numbers[i] == 1) continue;
                if (numbers[i] % j == 0) {
                    cnt ++;
                }
            }

            if (cnt == 2) {
                sum += numbers[i]; // 소수 합

                if (min == 0) { // 최소값 비교
                    min = numbers[i];
                } else {
                    min = Math.min(min, numbers[i]);
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
        System.out.println(sum);
        System.out.println(min);
        }
    }
}
