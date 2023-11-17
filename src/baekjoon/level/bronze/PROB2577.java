package baekjoon.level.bronze;

import java.util.Scanner;

public class PROB2577 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static int[] numbers = new int[10];
    static final int SIZE_OF_INPUT = 3;
    static int input = 1;

    public static void main(String[] args) {
        for (int i = 0; i < SIZE_OF_INPUT; i ++) {
            input *= sc.nextInt();
        }
        solve();
    }

    public static void solve() {
        int remainder = 0;
        while (input > 0) {
            remainder = input % 10;
            numbers[remainder] ++;
            input /= 10;
        }

        for (int number : numbers) {
            sb.append(number).append("\n");
        }

        System.out.println(sb);
    }
}
