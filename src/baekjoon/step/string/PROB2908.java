package src.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2908 {
    /*
    상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를들어, 734 와 893 을 칠판에 적었다면, 상수는 이 수를 437 과 398 로 읽는다.
    따라서, 상수는 두 수중 큰 수인 437 을 큰 수라고 말 할 것이다.

    두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하세요.

    [입력] 첫째 줄에 상근이가 칠판에 적은 두 수 A 와 B 가 주어진다. 두 수는 같지 않은 세자리 수이며, 0 이 포함되어 있지 않다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());

        int A1 = ((A%10)*100) + ((A%100)-(A%10)) + (A/100);
        int B1 = ((B%10)*100) + ((B%100)-(B%10)) + (B/100);

        int max = Math.max(A1, B1);

        System.out.println(max);

    }

}
