package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB10809 {
    /*
    알파벳 소문자로만 이루어진 단어 S 가 주어진다.
    각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
    포함하지 않는 경우에는 -1 을 출력하는 프로그램을 작성하세요.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String word = br.readLine();

        for (char c = 'a'; c <='z'; c++) {
            // 입력 단어에 주어진 알파벳이 있다면, 해당 알파벳의 인덱스를 출력
            sb.append(word.indexOf(c) + " ");
        }

        System.out.println(sb);
    }
}
