package SWExpertAcademy.D1;

import java.util.Arrays;
import java.util.Scanner;

public class PROB2063 {
    // 입력으로 N 개의 점수가 주어졌을 때, 중간값을 출력하라.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(arr[N/2]);

    }

}
