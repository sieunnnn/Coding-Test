package baekjoon.step.numberTheory2;

import java.io.IOException;
import java.util.Scanner;

public class PROB13909 {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        N = sc.nextInt();

        for (int i = 1; i * i <= N; i ++) {
            cnt ++;
        }

        System.out.println(cnt);
    }
}
