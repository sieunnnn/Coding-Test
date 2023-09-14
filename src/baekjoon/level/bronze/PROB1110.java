package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB1110 {
    /*
    0 보다 크거나 같고, 99 보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.
    먼저 주어진 수가 10 보다 작다면 앞에 0 을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
    그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다.

    [예시]
        1 번째 사이클 2 + 6 = 8 , 68
        2 번째 사이클 6 + 8 = 14, 84
        3 번째 사이클 8 + 4 = 12, 42
        4 번째 사이클 4 + 2 = 6, 26

        4번만에 원래 수로 돌아왔기 때문에 사이클의 길이는 4이다.

    N 이 주어졌을 때, N 의 사이클의 길이를 구하는 프로그램을 작성하세요.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cycle = 0;

        // 처음에 입력받은 수 임시저장
        int temp = N;

        do {
            N = ((N%10)*10) + ((N%10)+(N/10))%10;
            cycle ++;
        } while(temp != N);

        System.out.println(cycle);

    }
}
