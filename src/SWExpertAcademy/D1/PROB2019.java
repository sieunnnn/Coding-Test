package SWExpertAcademy.D1;

import java.util.Scanner;

import static java.lang.Math.round;

public class PROB2019 {
    /*
    1 부터 주어진 횟수까지 2 를 곱한 값들을 출력하기
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int number = sc.nextInt();

        for (int i = 0; i <= number; i++) {
            sb.append(round(Math.pow(2, i))).append(" ");
        }

        System.out.println(sb);
    }
}
