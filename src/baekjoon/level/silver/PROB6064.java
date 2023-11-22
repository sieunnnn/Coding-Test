package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB6064 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int T, M, N;
    static int x, y;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i ++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            solve();
        }
        System.out.println(sb.toString());
    }

    public static void solve() {
        int max = lcm(M, N);
        int result = -1;

        int ix = 0, iy = 0;
        while(true) {
            int tempX = M * ix + x;
            int tempY = N * iy + y;

            if(tempX > max  || tempY > max ) {
                break;
            }

            if(tempX == tempY) {
                result = tempX;
                break;

            }else {
                if(tempX < tempY) {
                    ix++;
                }else {
                    iy++;
                }
            }
        }
        sb.append(result).append("\n");
    }

    public static int lcm(int a, int b) {
        if(a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        return a * b / gcd(a,b);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
