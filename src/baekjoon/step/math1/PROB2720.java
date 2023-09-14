package algorithm.math.baekjoon;

import java.util.HashMap;
import java.util.Scanner;

public class PROB2720 {

    /**
     * @Variable T: 테스트 케이스 수
     * @Variable C: 거스름돈
     * 단위는 센트 (1달러 = 100 센트)
     */

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static int T;
    static int C = 0;
    static int idx;
    static int[] cents = {25, 10, 5, 1};
    static int[] cnt = {0, 0, 0, 0};

    public static void main(String[] args) {
        T = sc.nextInt();

        for (int i = 0; i < T; i ++) {
            C = sc.nextInt();
            idx = 0;
            cnt = new int[] {0, 0, 0, 0};

            while(C > 0) {
                if (cents[idx] > C) {
                    idx ++;
                } else {
                    cnt[idx] = C / cents[idx];
                    C %= cents[idx];
                }
            }

            for (int cnt : cnt) {
                sb.append(cnt).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
