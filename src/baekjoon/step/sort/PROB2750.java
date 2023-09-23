package baekjoon.step.sort;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PROB2750 {

    static Scanner sc = new Scanner(System.in);
    static int[] numbers;
    static int N;

    public static void main (String[] args) {
        N = sc.nextInt();
        numbers = new int[N];
        for (int i = 0; i < N; i ++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
