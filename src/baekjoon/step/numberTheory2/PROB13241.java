package baekjoon.step.numberTheory2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB13241 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static long a, b;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());

        System.out.println(lcm(a, b));
    }

    // 최소 공배수 찾기
    public static long lcm(long a, long b) {

        return a * b / gcd(a, b);
    }

    // 최대 공약수 찾기
    public static long gcd(long a, long b) {

        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }
}

