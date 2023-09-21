package baekjoon.step.bruteForce;

import java.util.Scanner;

public class PROB2231 {
    // 주어진 N 의 가장 작은 생성자 구하기

    static Scanner sc = new Scanner(System.in);
    static int N;
    static int startNum;
    static int temp;
    static int sum;
    static int answer;

    public static void main(String[] args) {
        N = sc.nextInt();
        startNum = N - String.valueOf(N).length() * 9;
//        System.out.println("숫자의 길이: " + String.valueOf(N).length());
        for (int i = startNum; i < N; i ++) {
            temp = i;
            sum = i;
//            System.out.println("startTemp: " + temp);
            while (temp > 0) {
                sum += temp % 10;
//                System.out.println("합: " + sum);
                temp /= 10;
//                System.out.println("temp: " + temp);
            }

            if (sum == N) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
