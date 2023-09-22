package baekjoon.step.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB19532 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int a;
    static int b;
    static int c;
    static int d;
    static int e;
    static int f;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());

        for(int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if ((a * i + b * j == c) && (d * i + e * j == f)) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }
}
