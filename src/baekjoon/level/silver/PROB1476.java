package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1476 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] numbers = new int[3];
    static int year = 0;
    static int E = 0;
    static int S = 0;
    static int M = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numbers.length; i ++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solve());
    }

    public static int solve() {
        while (true) {
            year ++;
            E ++;
            S ++;
            M ++;

            if (E == 16) E = 1;
            if (S == 29) S = 1;
            if (M == 20) M = 1;
            if (E == numbers[0] && S == numbers[1] && M == numbers[2]) {
                break;
            }
        }
        return year;
    }
}
