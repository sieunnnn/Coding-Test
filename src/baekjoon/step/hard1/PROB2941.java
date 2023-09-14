package src.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        numnerOfAlphabet(word);

    }

    private static void numnerOfAlphabet(String word) {
        String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < alphabet.length; i++) {
            if (word.contains(alphabet[i])) {
                word = word.replace(alphabet[i], "0");
            }
        }

        System.out.println(word.length());
    }

}
