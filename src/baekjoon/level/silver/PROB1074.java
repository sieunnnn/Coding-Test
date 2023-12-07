package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1074 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int size = (int) Math.pow(2, N);

        solve(size, r, c);
        System.out.println(count);
    }

    public static void solve(int size, int r, int c) {
        if (size == 1) {
            return;
        }

        int half = size / 2;
        int area = half * half; // 한 사분면의 크기

        if (r < half && c < half) { // 2 사분면
            solve(half, r, c);
        } else if (r < half && c >= half) { // 1 사분면
            count += area;
            solve(half, r, c - half);
        } else if (r >= half && c < half) { // 3 사분면
            count += 2 * area;
            solve(half, r - half, c);
        } else { // 4 사분면
            count += 3 * area;
            solve(half, r - half, c - half);
        }
    }
}
