package baekjoon;

import java.io.*;
import java.util.*;

public class PROB3562 {
    /*
    9 개의 서로 다른 자연수 들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지 구하기
     */

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int max = arr[0];
        int idx = 0;

        for (int i = 0; i < arr.length; i ++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (max < arr[i]) {
                max = arr[i];
                idx = i + 1;
            }
        }

        System.out.println(max + "\n" + idx);
    }
}
