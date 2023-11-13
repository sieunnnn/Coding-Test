package baekjoon.level.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB4153 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[] numbers = new int[3];

    public static void main(String[] args) throws IOException {
        while (true) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < numbers.length; i ++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }
            if (numbers[0] == 0 && numbers[1] == 0 && numbers[2] == 0) {
                break;
            } else {
                Arrays.sort(numbers);
                solve(numbers);
            }
        }

        System.out.println(sb);
    }

    public static void solve(int[] numbers) {
        boolean flag = false;

        numbers[0] = (int) Math.pow(numbers[0], 2);
        numbers[1] = (int) Math.pow(numbers[1], 2);
        numbers[2] = (int) Math.pow(numbers[2], 2);

        if (numbers[2] == numbers[0] + numbers[1]) {
            flag = true;
        }

        if (flag) {
            sb.append("right").append("\n");
        } else {
            sb.append("wrong").append("\n");
        }
    }
}
