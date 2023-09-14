package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PROB18108 {
    // 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하세요.

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        System.out.println(year - 543);
    }
}
