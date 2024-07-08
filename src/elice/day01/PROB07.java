package elice.day01;

import java.io.*;
//import java.util.Arrays;

public class PROB07 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int lastIdx;
    static int currentIdx = 0;
    static String[] input;

    public static void main(String[] args) throws IOException {
        input = br.readLine().split("");
        lastIdx = input.length - 1;
//        System.out.println(Arrays.toString(input));

        System.out.println(solve());
    }

    public static String solve() {
        while (lastIdx >= currentIdx) {
            if (input[currentIdx].equals(input[lastIdx])) {
                lastIdx--;
                currentIdx++;

            } else {
                return "NO";
            }
        }
        return "YES";
    }
}
