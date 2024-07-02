package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PROB1181 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static List<String> words = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String word = br.readLine();

            if (!words.contains(word)) {
                words.add(word);
            }
        }

        solve();

        for (String word : words) {
            sb.append(word).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void solve() {
        words.sort((o1, o2) -> {
            if(o1.length() != o2.length()) return o1.length() - o2.length(); // 길이순
            else return o1.compareTo(o2); // 사전순 정렬
        });
    }
}