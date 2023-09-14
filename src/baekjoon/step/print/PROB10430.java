package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB10430 {
    /*
    (A+B)%C 는 ((A%C)+(B%C))%C 와 같을까?
    (A*B)%C 는 ((A%C)*(B%C))%C 와 같을까?

    세 수 A, B, C 가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하세요.
     */

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);

    }
}
