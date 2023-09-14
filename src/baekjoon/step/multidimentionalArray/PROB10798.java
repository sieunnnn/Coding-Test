package dataStructure.array.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class PROB10798 {
    // 주어진 단어를 세로로 읽기

    static Scanner sc = new Scanner(System.in);
    static String[][] words = new String[5][15];
    static StringBuilder sb = new StringBuilder();
    static String temp;

    public static void main(String[] args) throws IOException {
        // 입력
        for (int i = 0; i < 5; i ++) {
            temp = sc.nextLine();
            for (int j = 0; j < temp.length(); j ++) {
                words[i][j] = String.valueOf(temp.charAt(j));
            }
        }

        for (int i = 0; i < 15; i ++) {
            for (int j = 0; j < 5; j ++) {
                if (words[j][i] == null) {
                    continue;
                }
                sb.append(words[j][i]);
            }
        }

        System.out.println(sb.toString());
    }
}
