package baekjoon.level.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB1759 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String[] alphabets;
    static int L, C;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        alphabets = new String[C];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            alphabets[i] = st.nextToken();
        }

        Arrays.sort(alphabets);
        backTracking(0, 0, "", 0, 0);
        System.out.println(sb.toString());
    }

    public static void backTracking(int depth, int start, String str, int vowels, int consonants) {
        if (depth == L) {
            if (vowels >= 1 && consonants >= 2) {
                sb.append(str).append("\n");
            }
            return;
        }

        for (int i = start; i < C; i++) {
            String nextAlphabet = alphabets[i];
            int addVowels = isVowel(nextAlphabet) ? 1 : 0;
            backTracking(depth + 1, i + 1, str + nextAlphabet, vowels + addVowels, consonants + (addVowels == 0 ? 1 : 0));
        }
    }

    private static boolean isVowel(String alphabet) {
        return "aeiou".contains(alphabet);
    }
}
