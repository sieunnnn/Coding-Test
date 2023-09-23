package baekjoon.step.sort;

import java.util.Scanner;

public class PROB1427 {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static String[] temps;
    static int[] numbers;
    static int temp;

    public static void main(String[] args) {
        temps = sc.next().split("");
        numbers = new int[temps.length];
        for (int i = 0; i < temps.length; i++) {
            numbers[i] = Integer.parseInt(temps[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        for (int number : numbers) {
            sb.append(number);
        }

        System.out.println(sb.toString());
    }
}
