package baekjoon;

import java.io.*;
import java.util.*;

public class PROB1546 {
    /*
    자기 점수중에 최댓값을 골라 M 으로 정하고, 모든 점수를 점수/M * 100 으로 고친다.
    그 후 새로운 평균을 구하는 프로그램을 작성하시오
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        // 시험점수 배열

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        double max = arr[0];
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < N; i++) {

            arr[i] = Integer.parseInt(st.nextToken());

            max = Math.max(max, arr[i]);

            sum += arr[i];
        }

        sum /= max;
        sum *= 100.0;
        avg = sum / N;

        System.out.println(avg);
    }
}
