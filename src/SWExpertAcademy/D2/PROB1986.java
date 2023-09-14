package SWExpertAcademy.D2;

import java.util.Scanner;

public class PROB1986 {
    /*
    1 부터 N 까지의 숫자에서 홀수는 더하고 짝수는 뺐을 때 최종 누적 값 구하기
    출력 시 # t = 누적값
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int N = sc.nextInt();
            int answer = 0;

            for(int j = 1; j <= N; j++) {
                if (j % 2 != 0) {
                    answer += j;
                }else {
                    answer -= j;
                }
            }

            sb.append("#").append(i).append(" ").append(answer).append("\n");
        }

        System.out.println(sb);
    }
}
