package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PROB9498 {
    /*
    시험 점수를 입력받아 90~100 점은 A, 80~89 점은 B, 70~79 점은 C, 60~69 점은 D,
    나머지 점수는 F 를 출력하는 프로그램을 작성하시오.
     */

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(br.readLine());

        System.out.println((score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F");

    }

}
