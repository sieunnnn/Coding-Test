package baekjoon;

import java.util.*;
import java.io.*;

public class PROB9086 {
    /*
    문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하기
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        String str;

        for (int i = 0; i < T; i++) {

            str = br.readLine();

            sb.append(str.charAt(0)).append(str.charAt(str.length() - 1)).append("\n");
        }

        System.out.println(sb);

    }
}
