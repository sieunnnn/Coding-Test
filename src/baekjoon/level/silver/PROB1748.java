package baekjoon.level.silver;

import java.util.Scanner;

public class PROB1748 {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static int answer;

    public static void main(String[] args) {
        N = sc.nextInt();
        for (int i = 1; i <= N; i ++) {
            answer += checkLength(i);
        }
        System.out.println(answer);
    }

    public static int checkLength(int number) {
        int cnt = 0;
        while (number > 0) {
            number = number / 10;
            cnt ++;
        }
        return cnt;
    }
}
