package dataStructure.string.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB1543 {
    // 문서와 검색하려는 단어가 주어졌을 때, 그 단어가 최대 몇 번 중복되지 않게 등장하는지 구하기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str2 = br.readLine();


        int length = str.length();
        int length2 = str2.length();

        str = str.replace(str2, "");

        System.out.println((length - str.length()) / length2);
    }
}
