package dataStructure.string.baekjoon;

import java.util.Scanner;

public class PROB1919 {

    // 두개의 문자열이 주어지고, 뒤집었을때 같은 문자열을 만들기 위해 지워야 하는 문자의 개수 구하기.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        int[] cntStr1 = new int[26];
        int[] cntStr2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            cntStr1[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            cntStr2[str2.charAt(i) - 'a']++;
        }

        int answer = 0;

        for (int i = 0; i < cntStr1.length; i++) {
            if (cntStr1[i] != cntStr2[i]) {
                answer += Math.abs(cntStr1[i] - cntStr2[i]);
            }
        }

        System.out.println(answer);
    }
}
