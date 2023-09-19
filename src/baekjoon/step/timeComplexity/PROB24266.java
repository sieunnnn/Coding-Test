package baekjoon.step.timeComplexity;

import java.util.Scanner;

public class PROB24266 {
    // for 문이 세번도므로 시간복잡도는 O(n^3) 이다.

    static Scanner sc = new Scanner(System.in);
    static long n;

    public static void main (String[] args) {
        n = sc.nextLong();
        System.out.println(n * n * n);
        System.out.println(3);
    }
}
