package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1330 {
    // 두 정수 A 와 B 가 주어졌을 떄, A 와 B 를 비교하는 프로그램을 작성하세요.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        String output = (A > B) ? ">" : (A == B) ? "==" : "<" ;
        System.out.println(output);

    }
}
