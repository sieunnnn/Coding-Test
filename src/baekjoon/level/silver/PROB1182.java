package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1182 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, S;
    static int[] numbers;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        numbers = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(0, 0);
        if (S == 0) {
            answer --; // 빈 수열 제외
        }
        System.out.println(answer);
    }

    public static void backTracking(int index, int sum) {
        if (index == N) {
            if (sum == S) {
                answer++;
            }
            return;
        }

        // 현재 인덱스의 숫자를 포함하는 경우
        backTracking(index + 1, sum + numbers[index]);

        // 현재 인덱스의 숫자를 포함하지 않는 경우
        backTracking(index + 1, sum);
    }
}

