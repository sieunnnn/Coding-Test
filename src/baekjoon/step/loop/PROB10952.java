package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB10952 {
    // A + B 를 출력하는 프로그램을 작성하세요. 단, 입력의 마지막에는 0 두 개가 들어온다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(A == 0 && B == 0) {
            break;
        }

        System.out.println(A+B);

        }
    }
}
