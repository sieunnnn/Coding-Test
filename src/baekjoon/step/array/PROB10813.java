package baekjoon;

import java.io.*;
import java.util.*;

public class PROB10813 {
    /*
    첫째줄에  N 과 M 이 주어진다.
    i 번 바구니와 j 번 바구니에 들어 있는 공을 교환한다.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 배열 초기화
        int arr[] = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

//        System.out.println(Arrays.toString(arr));

        // 배열 바꾸기

        int count = 0;

        while (count < M) {

            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st2.nextToken()) -1;
            int j = Integer.parseInt(st2.nextToken()) -1;

            int temp = arr[i];

            arr[i] = arr[j];
            arr[j] = temp;

//            System.out.println(Arrays.toString(arr));

            count ++;
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
