package baekjoon.step.numberTheory2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1735 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int a,b,c,d;
    static int temp;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        a = a * d + b * c;
        b = b * d;
        int temp = gcd(a, b);

        System.out.println((a / temp) + " " + (b / temp));
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
