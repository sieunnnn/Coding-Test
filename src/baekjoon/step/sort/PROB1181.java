package baekjoon.step.sort;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PROB1181 {

    static Scanner sc = new Scanner(System.in);
    static int N;
    static String[] words;

    public static void main(String[] args) throws IOException {
        N = sc.nextInt();
        words = new String[N];

        for (int i = 0; i < words.length; i ++) {
            words[i] = sc.next();
        }

        Arrays.sort(words, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });

        for (int i = 0; i < words.length; i ++) {
            if (i == 0) {
                System.out.println(words[i]);
            } else {
                if (!words[i-1].equals(words[i])) {
                    System.out.println(words[i]);
                }
            }
        }
    }
}
