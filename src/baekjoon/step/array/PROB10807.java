package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB10807 {
    /*
    첫째 줄에 정수의 개수 N 이 주어진다.
    둘째 줄에는 정수가 공백으로 구분되어져 있다.
    셋째 줄에는 찾으려고 하는 정수 v 가 주어진다.

    첫째 줄에 입력으로 주어진 N 개의 정수 중에 v 가 몇 개인지 출력한다.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 위치 주의하기
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 배열 선언
        int[] arr = new int[N];

        // 공백 기준으로 얻은 정수를 배열에 넣는다.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 개수를 찾아야 하는 정수 입력받기
        int v = Integer.parseInt(br.readLine());

        // 개수 찾기
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v) {
                count ++;
            }
        }

        System.out.println(count);
    }
}
