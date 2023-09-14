package SWExpertAcademy.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB2047 {

    /*
    소문자 모두 대문자로 바꿔서 출력하기
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] str = br.readLine().toCharArray();

        for (int i = 0; i < str.length; i++) {

            if (str[i] >= 'a' && str[i] < 'z') {
                sb.append(Character.toUpperCase(str[i]));

            } else {
                sb.append(str[i]);
            }
        }

        System.out.println(sb);
    }
}
