package SWExpertAcademy.D2;

import java.util.Scanner;

public class PROB1989 {

    // 회문
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();

        int T = sc.nextInt();

        for (int i = 0; i <T; i ++){
            String str = sc.next();
            int value = 0;

            // 입력받은 문자열 거꾸로 만들기
            String reversed = new StringBuilder(str).reverse().toString();

            if (str.equals(reversed)) {
                value = 1;
            }

            answer.append("#").append(i + 1).append(" ").append(value).append("\n");
        }
        System.out.println(answer);

    }
}
