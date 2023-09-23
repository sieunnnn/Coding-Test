package baekjoon.step.sort;

import java.util.Arrays;
import java.util.Scanner;

public class PROB2587 {

    static Scanner sc = new Scanner(System.in);
    static int[] numbers = new int[5];
    static int sum;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i ++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum / 5);
        System.out.println(numbers[2]);
    }
}
