package baekjoon.step.combinatoric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB11050 {
    // nCr = r! / n!(n - r)!

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int a, b;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        System.out.println(fac(a) / (fac(b) * fac(a - b)));
    }

    public static int fac (int n) {
        if (n == 0) {
            return 1;
        }

        return n * fac(n - 1);
    }
}
