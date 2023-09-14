package algorithm.math.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB5086 {

    /**
     * 두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.
     * 첫 번째 숫자가 두 번째 숫자의 약수이다. =>  factor
     * 첫 번째 숫자가 두 번째 숫자의 배수이다. =>  multiple
     * 첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다. =>  neither
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int a;
    static int b;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        while (true) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }

            if (a > b && a % b == 0) {
                sb.append("multiple");
            } else if (a < b && b % a == 0) {
                sb.append("factor");
            } else {
                sb.append("neither");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
