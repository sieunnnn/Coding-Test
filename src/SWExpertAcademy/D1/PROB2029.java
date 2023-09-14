package SWExpertAcademy.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2029 {

    /*
    2 개의 수 a, b 를 입력 받아, a 를 b 로 나눈 몫과 나머지를 출력하는 프로그램 작성
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append("#").append(i + 1) .append(" ").append(a / b).append(" ").append(a % b).append("\n");
        }

        System.out.println(sb);


    }
}
