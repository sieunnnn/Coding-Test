package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PROB2753 {
    /*
    연도가 주어졌을 때, 윤년이면 1, 아니면 0 을 출력하는 프로그램을 작성하세요.
        윤년: 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
     */

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        System.out.println((((year % 4) == 0 && (year % 100) != 0) || year % 400 == 0) ? "1" : "0");

    }
}
