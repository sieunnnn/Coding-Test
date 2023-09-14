package src.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB1157 {
    /*
    알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하세요.
    단, 대문자와 소문자를 구분하지 않으며 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ? 를 출력한다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toUpperCase();

        int alphabet[] = new int[26];

        int max = -1;
        char result = '?';

        for (int i=0; i<word.length(); i++) {
            alphabet[word.charAt(i) - 'A']++;
            if (max < alphabet[word.charAt(i) - 'A']) {
                max = alphabet[word.charAt(i) - 'A'];

                result = word.charAt(i);
            } else if (max == alphabet[word.charAt(i) - 'A']) {
                result = '?';

            }
        }

        System.out.println(result);

    }

}
