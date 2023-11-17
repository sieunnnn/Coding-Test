package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PROB18110 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int[] numbers;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        numbers = new int[n];
        for (int i = 0; i < n; i ++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        solve();
    }

    public static void solve() {
        Arrays.sort(numbers);

        int temp = (int) Math.round((n * 0.15));
//        System.out.println(n * 0.15 + " " + temp);
        double sum = 0;
        int startIdx = temp;
        int lastIdx = n - temp;

        for(int i = startIdx; i < lastIdx; i ++) {
            sum += numbers[i];
        }

        int answer = (int) Math.round(sum / (n - 2 * startIdx));
        System.out.println(answer);
    }
}
