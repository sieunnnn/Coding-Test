package baekjoon.level.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2920 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] inputs = new int[8];

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < inputs.length; i ++) {
            inputs[i] = Integer.parseInt(st.nextToken());
        }
        solve();
    }

    public static void solve() {
        String answer = "";
        for (int i = 1; i < inputs.length; i ++) {
            if (inputs[0] == 1) {
                answer = (inputs[i] == inputs[i - 1] + 1) ? "ascending" : "mixed";
                if (answer.equals("mixed")) break;
            } else if (inputs[0] == 8) {
                answer = (inputs[i] == inputs[i - 1] - 1) ? "descending" : "mixed";
                if (answer.equals("mixed")) break;
            } else {
                answer = "mixed";
            }
        }
        System.out.println(answer);
    }
}
