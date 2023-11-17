package baekjoon.level.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2475 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] numbers = new int[5];
    static final int SIZE_OF_NUMBER = 5;
    static double sum = 0;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < SIZE_OF_NUMBER; i ++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        solve();
    }

    public static void solve() {
        for (int number : numbers) {
            sum += Math.pow(number, 2);
        }

        answer = (int)(sum % 10);
        System.out.println(answer);
    }
}
