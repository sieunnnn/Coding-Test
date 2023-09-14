package baekjoon;

import java.io.*;
import java.util.*;

public class PROB10811 {
    /*
    첫째줄에 N 과 M 이 주어진다.
    i 번째 바구니부터 j 번재 바구니의 순서를 역순으로 만든다.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {

            arr[i] = i + 1;
        }

//        System.out.println(Arrays.toString(arr));

        int count = 0;

        while (count < M) {

            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st2.nextToken()) - 1;
            int j = Integer.parseInt(st2.nextToken()) - 1;

            int temp = 0;

            while (i <= j) {

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

//            System.out.println(Arrays.toString(arr));
            count++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
