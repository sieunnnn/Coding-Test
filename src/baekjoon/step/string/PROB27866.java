package baekjoon;

import java.io.*;
import java.util.*;

public class PROB27866 {
    /*
    첫째 줄에 단어가 주어진다.
    둘째 줄에 정수가 주어진다.
    정수번째 글자를 출력한다.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        int i = Integer.parseInt(br.readLine());

        System.out.println(word.charAt(i - 1));
    }
}
