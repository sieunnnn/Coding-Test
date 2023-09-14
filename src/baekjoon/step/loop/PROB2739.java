package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB2739 {
    // N 을 입력받은 뒤, 구구단 N 단을 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < 10; i++) {
            System.out.println(N + " * " + i + " = " + N*i);
        }

    }
}
