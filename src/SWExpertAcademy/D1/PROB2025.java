package SWExpertAcademy.D1;

import java.util.Scanner;

public class PROB2025 {

    /*
    1 부터 주어진 숫자만큼 모두 더한 값을 출력하기
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt() + 1;

        int sum = 0;

        for (int i = 1; i < number; i++) {

            sum += i;

        }

        System.out.println(sum);
    }
}
