package algorithm.math.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PROB9506 {

    /**
     * 어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.
     * 예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
     * n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.
     *
     * n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).
     * 이때, 약수들은 오름차순으로 나열해야 한다.
     * n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Integer> numbers;
    static StringBuilder sb;
    static StringBuilder answer = new StringBuilder();
    static int n;
    static int sum;

    public static void main (String[] args) throws IOException {
        while (true) {
            n = Integer.parseInt(br.readLine());
            numbers = new ArrayList<>(); // 초기화
            sb = new StringBuilder(); // 초기화
            sum = 0; // 초기화

            if (n == -1) {
                break;
            }

            for (int i = 1; i < n; i ++) {
                if (n % i == 0) {
                    numbers.add(i);
                }
            }

            // 완전수 판단
            for (int number : numbers) {
                sum += number;

                if (number == 1) {
                    sb.append(n).append(" = ").append(number);
                } else {
                    sb.append(" + ").append(number);
                }
            }

            if (sum == n) {
                answer.append(sb);
            } else {
                answer.append(n).append(" is NOT perfect.");
            }
            answer.append("\n");
        }

        System.out.println(answer);
    }
}
