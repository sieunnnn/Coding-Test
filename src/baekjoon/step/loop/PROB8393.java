package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB8393 {
    // n 이 주어졌을 때, 1 부터 n 까지의 합을 구하는 프로그램을 작성하세요.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum =0;

        for (int i = 0 ; i < n + 1; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
