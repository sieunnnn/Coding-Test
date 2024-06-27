package baekjoon.level.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2869 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] values = new int[3];

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 3; i++) {
            values[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve());
    }

    public static int solve() {
        int A = values[0];
        int B = values[1];
        int V = values[2];

        int day = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) {
            day++;
        }

        return day;
    }
}