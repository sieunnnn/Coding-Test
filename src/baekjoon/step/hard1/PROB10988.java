package dataStructure.string.baekjoon;

import java.util.Scanner;

public class PROB10988 {
    // 팰린드롬인지 확인하기

    static Scanner sc = new Scanner(System.in);
    static String[] word;
    static int idx;
    static int answer;

    public static void main(String[] args) {
        word = sc.nextLine().split("");
        answer = 1;
        idx = word.length - 1;

        for (int i = 0; i < word.length; i ++) {
            if (!word[i].equals(word[idx --])) {
                answer = 0;
                break;
            }
        }

        System.out.println(answer);
    }
}
