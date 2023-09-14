package baekjoon;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class PROB3052 {
    /*
    숫자 10 개를 입력받은 뒤 이를 42 로 나눈 나머지를 구한다.
    그 다음 서로 다른 값이 몇 개 있는지 출력하시오
     */

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 배열 생성

        int[] arr = new int[10];

        for(int i = 0; i < 10; i++) {

            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        System.out.println(Arrays.toString(arr));


        // 같지 않은 나머지 개수 구하기

        boolean bl;
        int count = 0;

        for(int i = 0; i < 10; i ++) {

            bl = true;

            for (int j = i + 1; j < 10; j ++) {

                if(arr[i] == arr[j]) {

                    bl = false;

                    break;
                }

            }

            if (bl) {
                count ++;
            }

        }

        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
