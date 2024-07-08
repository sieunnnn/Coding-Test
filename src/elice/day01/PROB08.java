package elice.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;
import java.util.Stack;

public class PROB08 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String[] inputs;
    static Stack<String> brackets = new Stack<>();

    public static void main(String[] args) throws IOException {
        inputs = br.readLine().split("");
//        System.out.println(Arrays.toString(inputs));

        if (solve()) System.out.println("YES");
        else System.out.println("NO");
    }

    public static boolean solve() {
        for (String input : inputs) {
            if (input.equals("(")) {
                brackets.push(input);

            } else {
                if (brackets.isEmpty()) {
                    return false;

                } else {
                    brackets.pop();
                }
            }
        }

        return brackets.isEmpty();
    }
}
