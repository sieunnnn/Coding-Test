package baekjoon.step.dynamicProgramming;

import java.util.Scanner;

public class PROB24416 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] f;
    static int fibCnt = 0;
    static int fibonacciCnt = 0;

    public static void main(String[] args) {
        n = sc.nextInt();
        f = new int[n + 1];

        fib(n);
        fibonacci(n);
        System.out.println(fibCnt + " " + fibonacciCnt);
    }

    // code 1
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            fibCnt ++;
            return 1;
        }
        return fib(n -1) + fib(n -2);
    }

    // code 2
    public static int fibonacci(int n) {
        f[1] = f[2] = 1;

        for (int i = 3; i <= n; i ++) {
            f[i] = f[i - 1] + f[i - 2];
            fibonacciCnt ++;
        }

        return f[n];
    }
}
