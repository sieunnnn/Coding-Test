package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB11718 {
    /*
    입력 받은 대로 출력
    알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
    공백으로 시작하지 않고, 공백으로 끝나지 않는다.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }
}
