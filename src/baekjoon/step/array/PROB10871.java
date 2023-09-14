package baekjoon;

import java.io.*;
import java.util.*;

public class PROB10871 {
    /*
    첫째 줄에 N 과 X 가 주어진다.
    둘째 줄에 수열 A 를 이루는 정수 N 개가 주어진다.
    X 보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st1.nextToken());
        int X = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {

            arr[i] = Integer.parseInt(st2.nextToken());

            if (arr[i] < X) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
