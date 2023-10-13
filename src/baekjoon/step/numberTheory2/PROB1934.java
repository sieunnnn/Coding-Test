package baekjoon.step.numberTheory2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1934 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int a, b;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            sb.append(lcm(a, b)).append("\n");
        }

        System.out.println(sb.toString());
    }

    // 최소 공배수 찾기
    public static int lcm(int a, int b) {

        return a * b / gcd(a,b);
    }

    // 최대 공약수 찾기
    public static int gcd(int a, int b) {

        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }
}
