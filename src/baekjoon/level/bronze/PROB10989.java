package dataStructure.array.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PROB10989 {

    /**
     * 수 정렬하기
     * @Variable N : 정렬할 수의 개수
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int[] numbers;

    public static void main (String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        numbers = new int[N];

        for (int i = 0; i < N; i ++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        for (int number : numbers) {
            sb.append(number).append("\n");
        }

        System.out.println(sb);
    }
}
