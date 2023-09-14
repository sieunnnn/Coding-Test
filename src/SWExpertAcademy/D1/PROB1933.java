package SWExpertAcademy.D1;

import java.util.Scanner;

public class PROB1933 {

    /*
    정수 N 의 약수를 오름차순으로 출력하기
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N  = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb);
    }
}
