package SWExpertAcademy.D1;

import java.util.Scanner;

public class PROB1545 {

    /*
    주어진 숫자부터 0 까지 거꾸로 출력
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        for (int i = N; i >= 0; i--) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
