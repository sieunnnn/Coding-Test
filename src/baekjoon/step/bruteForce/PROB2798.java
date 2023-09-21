package baekjoon.step.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PROB2798 {

    /**
     * N 장의 카드 중에서 3 장의 카드를 골라야 한다.
     * 플레이어가 고른 카드의 합은 M 을 넘지 않으면서 M 과 최대한 가까워야 한다.
     * N 이 100 밖에 안되기 때문에 삼중 포문 사용 가능.
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int M;
    static int[] numbers;
    static int sum;
    static ArrayList<Integer> sums;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        numbers = new int[N];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        sums = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j ++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    sum = numbers[i] + numbers[j] + numbers[k];

                    if (sum <= M) {
                        sums.add(sum);
                    }
                }
            }
        }

        for (int sum : sums) {
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
