package SWExpertAcademy.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB2056 {

    /*
        입력은 첫 줄에 총 테스트 케이스의 개수 T
        출력은 #t 년/월/일
        해당 날짜가 없으면 -1
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            String date = br.readLine();
            String year = date.substring(0, 4);
            String month = date.substring(4, 6);
            String day = date.substring(6);

            // month 유효성 판단
            if (Integer.parseInt(month) < 1 || Integer.parseInt(month) > 12) {
                sb.append("#").append(i+1).append(" ").append(-1).append("\n");

            } else {

                // day 유효성 판단
                if (month.equals("01") || month.equals("03") || month.equals("05") || month.equals("07") || month.equals("08") || month.equals("10") || month.equals("12")) {
                    if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > 31) {
                        sb.append("#").append(i+1).append(" ").append(-1).append("\n");

                    } else {
                        sb.append("#").append(i+1).append(" ").append(year).append("/").append(month).append("/").append(day).append("\n");
                    }

                } else if (month.equals("02")) {
                    if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > 28) {
                        sb.append("#").append(i+1).append(" ").append(-1).append("\n");

                    } else {
                        sb.append("#").append(i+1).append(" ").append(year).append("/").append(month).append("/").append(day).append("\n");
                    }

                } else {
                    if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > 30) {
                        sb.append("#").append(i+1).append(" ").append(-1).append("\n");

                    } else {
                        sb.append("#").append(i+1).append(" ").append(year).append("/").append(month).append("/").append(day).append("\n");
                    }

                }
            }
        }

        System.out.println(sb);
    }
}
