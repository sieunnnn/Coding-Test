package algorithm.math.baekjoon;

import java.util.Scanner;

public class PROB11005 {
    // 10 진법 -> N 진법

    static Scanner sc = new Scanner(System.in);
    static String[] strings = new String[2];
    static StringBuffer sb;
    static int remainder;
    static int quotient;
    static int number;
    static String answer = "";

    public static void main(String[] args) {
        strings = sc.nextLine().split(" ");
        quotient = Integer.parseInt(strings[0]);
        remainder = 0;
        number = Integer.parseInt(strings[1]);

        while (quotient > 0) {
            remainder = quotient % number;

            if (remainder < 10) {
                answer += String.valueOf(remainder);
            } else {
                answer += (char) (remainder - 10 + 'A');
            }

            quotient /= number;
        }

        sb = new StringBuffer(answer);
        sb.reverse();

        System.out.println(sb);
    }
}
