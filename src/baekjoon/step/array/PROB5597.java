package baekjoon;

import java.io.*;
import java.util.*;

public class PROB5597 {
    /*
    학생 30 명 중에서 과제 제출을 하지 않은 학생 2 명의 출석번호를 구하시오
    제출 안한 학생의 출석 번호는 작은 수부터 출력한다.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[30];

        for (int i = 0; i < arr.length; i++ ) {
            arr[i] = false;
        }

//        System.out.println(Arrays.toString(arr));

        int count = 0;

        while (count < 28) {

            int submit = Integer.parseInt(br.readLine());

            arr[submit - 1] = true;

            count++;
        }

//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i ++) {

            if (arr[i] == false) {
                System.out.println(i + 1);
            }
        }
    }
}
