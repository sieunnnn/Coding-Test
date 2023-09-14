package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB11720 {
    // N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하세요
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sum = 0;

        // 문자열 각각의 값을 char 값으로 변환 후, '0' 에 해당하는 아스키 코드값을 빼준다.
        for (int i = 0; i < N; i++) {
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);

    }

}
