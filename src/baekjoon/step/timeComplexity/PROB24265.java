package baekjoon.step.timeComplexity;

import java.util.Scanner;

public class PROB24265 {
    // 시간복잡도는 O(n^2) 이다.
    static Scanner sc = new Scanner(System.in);
    static long n;

    public static void main (String[] args) {
        n = sc.nextLong();
        System.out.println((n - 1) * n / 2); // 손으로 그려보면 쉽게 유도할 수 있다.
        System.out.println(2);
    }
}
