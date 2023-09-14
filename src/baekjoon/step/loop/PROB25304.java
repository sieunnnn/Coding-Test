package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB25304 {
    /*
    영수증에 적힌,
        1. 구매한 각 물건의 가격과 개수
        2. 구매한 물건들의 총 금액
    을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.

    [입력]
        1. 첫째 줄에는 영수증에 적힌 총 금액 X 가 주어진다.
        2. 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N 이 주어진다.
        3. 이후 N 개의 줄에는 각 물건의 가격 a 와 개수 b 가 공백을 사이에 두고 주어진다.

    [출력]
    구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes 를 출력한다.
    일치하지 않는다면 No 를 출력한다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sum += (a*b);

        }

        System.out.println((sum == X) ? "Yes" : "No");
    }
}
