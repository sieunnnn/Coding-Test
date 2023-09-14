package SWExpertAcademy.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1959 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int month1 = Integer.parseInt(st.nextToken());
            int day1 = Integer.parseInt(st.nextToken());
            int month2 = Integer.parseInt(st.nextToken());
            int day2 = Integer.parseInt(st.nextToken());

            int answer = 0;

            if (month1 == month2) {
                if (day1 != day2) {
                    answer = day2 - day1 + 1;
                }

            } else {
                answer = startMonth(month1, day1) + betweenMonth(month1, month2) + day2;
            }

            sb.append("#").append(i + 1).append(" ").append(answer).append("\n");
        }

        System.out.println(sb);
    }

    // 첫째 달 계산 하는 함수
    public static int startMonth(int month1, int day1) {
        if (month1 == 4 || month1 == 6 || month1 == 9 || month1 == 11) {
            return 30 - day1 + 1;

        } else if (month1 == 2) {
            return 28 - day1 + 1;

        } else {
            return 31 - day1 + 1;
        }
    }

    // 중간 달 계산하는 함수
    public static int betweenMonth (int month1, int month2) {
        int sum = 0;

        for (int i = month1 + 1; i < month2; i++) {
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                sum += 30;

            } else if (month2 == 2) {
                sum += 28;

            } else {
                sum += 31;
            }
        }

        return sum;
    }
}
