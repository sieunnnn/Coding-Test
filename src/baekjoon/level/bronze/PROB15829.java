package baekjoon.level.bronze;

import java.util.Scanner;

public class PROB15829 {
    static Scanner sc = new Scanner(System.in);
    static int L;
    static String input;
    static final int R_NUMBER = 31;
    static final int M_NUMBER = 1234567891;

    public static void main(String[] args) {
        L = sc.nextInt();
        input = sc.next();

        solve();
    }

    public static void solve() {
        long sum = 0;
        long pow = 1;
        for (int i = 0; i < input.length(); i ++) {
            int value = input.charAt(i) - 'a' + 1;
            sum += (value * pow) % M_NUMBER;
            pow = R_NUMBER * pow % M_NUMBER;
        }
        System.out.println(sum % M_NUMBER);
    }
}
