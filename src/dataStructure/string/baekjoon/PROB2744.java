package dataStructure.string.baekjoon;

import java.util.Scanner;

public class PROB2744 {

    // 대문자 -> 소문자, 소문자 -> 대문자
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
        }

        System.out.println(sb);
    }
}
