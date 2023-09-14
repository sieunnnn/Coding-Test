package baekjoon;

import java.io.*;
import java.util.*;

public class PROB10810 {
    /*
    첫째 줄 N 과 M 이 주어진다.
    둘째 줄부터 M 개의 줄에 걸쳐서 공을 넣는 방법이 주어진다.
    i 번 바구니부터 j 번 바구니까지 k 번 번호가 적혀져 있는 공을 넣는다.
     */

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        int count = 0;

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = 0;
        }

//        System.out.println(Arrays.toString(arr));

        while (count < M) {

            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st2.nextToken()) -1;
            int j = Integer.parseInt(st2.nextToken()) -1;
            int k = Integer.parseInt(st2.nextToken());

            for (int l = i; l <=j; l++) {
                arr[l] = k;
            }

//            System.out.println(Arrays.toString(arr));

            count++;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
