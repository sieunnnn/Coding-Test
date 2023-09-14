package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PROB14681 {
    // 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하세요.
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        System.out.println(((x > 0) && (y > 0)) ? "1" : ((x < 0) && (y > 0)) ? "2" : ((x < 0) && (y < 0)) ? "3" : "4" );

    }
}
