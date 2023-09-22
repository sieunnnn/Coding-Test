package baekjoon.step.bruteForce;

import java.util.Scanner;

public class PROB2839 {

    static Scanner sc = new Scanner(System.in);
    static int N;
    static int cnt = 0;

    public static void main(String[] args) {
        N = sc.nextInt();

        while (true) {
            if (N % 5 == 0) {
                cnt += (N / 5);
                break;

            } else if (N < 0) {
                cnt = -1;
                break;
            }

            N -= 3;
            cnt ++;
        }

        System.out.println(cnt);
    }
}
