package SWExpertAcademy.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB2050 {

    /*
    각 알파벳을 1 부터 26 까지의 숫자로 변환
    기준 : 대문자로 둬야겠다.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 문자열 바로 배열로 변경
        char[] strArr = br.readLine().toCharArray();

        // 알파벳 배열
        char[] arr = new char[26];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (char)(65 + i);
        }

        // 출력
        for (int i = 0; i < strArr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (Character.toUpperCase(strArr[i]) == arr[j]) {
                    sb.append(j + 1).append(" ");
                }
            }
        }

        System.out.println(sb);

    }
}
