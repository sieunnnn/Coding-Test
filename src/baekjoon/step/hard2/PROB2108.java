package baekjoon.step.hard2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class PROB2108 {
    // 산술 평균, 중앙값, 최빈값, 범위

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] numbers;
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        numbers = new int[N];
        for(int i = 0; i < N; i ++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        ArithmaticMean();
        median();
        mode();
        subMaxAndMin();
    }

    public static void ArithmaticMean() {
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }

        System.out.println(Math.round(sum / N));
    }

    public static void median() {
        System.out.println(numbers[N / 2]);
    }

    public static void mode () {
        ArrayList<Integer> maxs = new ArrayList<>();
        int answer = 0;
        int[] cnts = new int[8001];
        int max = 0;

        for(int i = 0; i < N; i++) {
            cnts[numbers[i] + 4000] ++;
            max = Math.max(cnts[numbers[i] + 4000], max);
        }

        for(int i = 0; i < cnts.length; i++) {
            if (max == cnts[i]) {
                maxs.add(i - 4000);
            }
        }

        answer = maxs.size() > 1? maxs.get(1) : maxs.get(0);
        System.out.println(answer);
    }

    public static void subMaxAndMin() {
        System.out.println(Math.abs(numbers[numbers.length - 1] - numbers[0]));
    }
}
