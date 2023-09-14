package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2480 {
    /*
    같은 눈이 3 개가 나오면 10000 + (같은 눈) * 1000 원의 상금을 받게 된다.
    같은 눈이 2 개가 나오면 1000 + (같은 눈) * 100 원의 상금을 받게 된다.
    모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈) * 100 원의 상금을 받게 된다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int money = 0;
        int max = 0;

        if (A == B && B == C) {
            money = 10000 + A * 1000;

        } if (A == B && B != C) {
            money = 1000 + A * 100;

        } if (A != B && B != C) {
            max = Math.max(A, Math.max(B,C));
            money = max * 100;
        }

        System.out.println(money);
    }
}
