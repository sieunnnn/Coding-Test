package baekjoon.step.numberTheory;

import java.util.ArrayList;
import java.util.Scanner;

public class PROB11653 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> numbers = new ArrayList<>();
    static int N;
    static int number = 2;

    public static void main(String[] args) {
        N = sc.nextInt();

        while (N > 1) {
            if (N % number == 0) {
                numbers.add(number);
                N /= number;
            } else {
                number ++;
            }
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
