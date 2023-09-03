package dataStructure.array.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB3273 {

    /**
     * 자연수 x가 주어졌을 때, ai + aj = x (1 ≤ i < j ≤ n)을 만족하는 (ai, aj)쌍의 수를 구하는 프로그램을 작성하시오.
     * 첫째 줄에 수열의 크기 n이 주어진다.
     * 다음 줄에는 수열에 포함되는 수가 주어진다.
     * 셋째 줄에는 x가 주어진다. (1 ≤ n ≤ 100000, 1 ≤ x ≤ 2000000)
     * 문제의 조건을 만족하는 쌍의 개수를 출력한다.
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] numbers;
    static int n;
    static int x;
    static int left;
    static int right;
    static int cnt;


    public static void main (String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        x = Integer.parseInt(br.readLine());

        Arrays.sort(numbers);
        left = 0;
        right = numbers.length - 1;
        cnt = 0;

        while (left < right) {
            // 탐색
            if (numbers[left] + numbers[right] == x) {
                cnt ++;
                left ++;
                right --;
            } else if (numbers[left] + numbers[right] > x) {
                right --;
            } else {
                left ++;
            }
        }

        System.out.println(cnt);
    }
}
