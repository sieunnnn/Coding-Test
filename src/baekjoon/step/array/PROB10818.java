package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB10818 {
    /*
    첫째 줄에 주어진 정수 N 개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[arr.length-1]);
    }
}
