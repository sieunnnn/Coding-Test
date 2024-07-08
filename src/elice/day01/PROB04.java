package elice.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB04 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] words = br.readLine().split(" ");
            sb.append(words.length).append("\n");
        }

        System.out.println(sb.toString());
    }
}
