package baekjoon.level.silver;

import java.util.Scanner;

public class PROB1676 {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static int cnt = 0;

    public static void main(String[] args) {
        N = sc.nextInt();

        while (N >=5) {
            cnt += N / 5;
            N /= 5;
        }

        System.out.println(cnt);
    }
}
