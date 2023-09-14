package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1001 {
    // 두 정수 A 와 B 를 입력받은 다음, A-B 를 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());

        System.out.println(A - B);

    }
}