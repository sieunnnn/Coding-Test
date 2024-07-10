package elice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day03 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String[] inputs;

    public static void main(String[] args) throws IOException {
        inputs = br.readLine().split("");
//        System.out.println(Arrays.toString(inputs));
        System.out.println(solve());
    }

    public static int solve() {
        int length = 0;
        int i = inputs.length - 1;

        while (i >= 0) {
            if (inputs[i].equals(")")) {
                i--;

            } else if (inputs[i].equals("(")) {
                int cnt = Integer.parseInt(inputs[i - 1]);

                length *= cnt;
                i -= 2;

            } else {
                length++;
                i--;
            }
        }
        return length;
    }
}
