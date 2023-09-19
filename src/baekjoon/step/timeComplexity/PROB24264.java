package baekjoon.step.timeComplexity;

import java.util.Scanner;

public class PROB24264 {
    // for 문이 두개 이므로 O(n^2)만큼의 시간 복잡도를 가진다. int -> long 형 주의

    static Scanner sc = new Scanner(System.in);
    static long n;

    public static void main (String[] args) {
        n = sc.nextLong();
        System.out.println(n * n);
        System.out.println(2);
    }
}
