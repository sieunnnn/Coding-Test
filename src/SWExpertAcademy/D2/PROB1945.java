package SWExpertAcademy.D2;

import java.util.Scanner;

public class PROB1945 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스 입력
        int T = sc.nextInt();


        // 테스트 케이스 만큼 N 입력
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();

            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;

            while (true) {
                // 소인수 분해
                if (N % 2 == 0) {
                    N = N / 2;
                    a ++;
                } else if (N % 3 == 0) {
                    N = N / 3;
                    b ++;
                } else if (N % 5 == 0) {
                    N = N / 5;
                    c ++;
                } else if (N % 7 == 0) {
                    N = N / 7;
                    d ++;
                } else if (N % 11 == 0) {
                    N = N / 11;
                    e ++;
                }

                if (N == 1) break;
            }

            sb.append("#").append(i).append(" ").append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append(" ").append(e).append("\n");
        }

        System.out.println(sb);
    }
}
