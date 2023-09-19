package baekjoon.step.timeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PROB24313 {

    /**
     *  f(n) = a1n + a0
     *  O(g(n)) = {f(n) | 모든 n ≥ n0에 대하여 f(n) ≤ c × g(n)인 양의 상수 c와 n0가 존재한다}
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int a1;
    static int a0;
    static int c;
    static int n;
    static int f;
    static int g;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        a1 = Integer.parseInt(st.nextToken());
        a0 = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());

        f = a1 * n + a0;
        g = n * c;

        if ((f <= g) && (c >= a1) ) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
