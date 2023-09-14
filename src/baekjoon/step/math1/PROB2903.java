package algorithm.math.baekjoon;

import java.util.Scanner;

public class PROB2903 {

    /**
     * 점의 개수는 아래와 같이 증가한다
     * 2 * 2 -> 3 * 3 -> 5 * 5 -> 9 * 9 -> 17 * 17 -> 33 * 33
     *
     * 따라서 점의 개수는 (2^n + 1)^2
     */

    static Scanner sc = new Scanner(System.in);
    static int N;
    static int answer;

    public static void main(String[] args) {
        N = sc.nextInt();
        answer = (int) Math.pow(Math.pow(2, N) + 1, 2);
        System.out.println(answer);
    }
}
