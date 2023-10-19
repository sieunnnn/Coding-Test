package baekjoon.step.numberTheory2;

import java.util.Arrays;
import java.util.Scanner;

public class PROB2485 {
    // 등차수열
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] trees;
    static int d = 0;

    public static void main(String[] args) {
        n = sc.nextInt();
        trees = new int[n];
        for (int i = 0; i < n; i ++) {
            trees[i] = sc.nextInt();
            if (i > 0) {
                int temp = trees[i] - trees[i -1];
                d = gcd(d, temp);
            }
        }

//        System.out.println(d);
        System.out.println((trees[n -1] - trees[0]) / d + 1 - n);
    }

    public static int gcd(int a, int b) {

        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }
}
