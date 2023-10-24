package baekjoon.step.prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB11659 {
    // 그냥 for 문 돌리면 시간 초과

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] numbers;
    static int N, M;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i ++) { // 누적합 미리 구하기
            numbers[i] = numbers[i - 1] + Integer.parseInt(st.nextToken());
        }

//        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < M; i ++) {
            st = new StringTokenizer(br.readLine());
            getPrefixSum(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
    }

    public static void getPrefixSum(int start, int last) {
//        System.out.println(start + " " + last);
        int sum = numbers[last] - numbers[start - 1];
        System.out.println(sum);
    }
}
