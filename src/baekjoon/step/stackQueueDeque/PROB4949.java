package baekjoon.step.stackQueueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PROB4949 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Stack<Character> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();
    static String str;

    public static void main(String[] args) throws IOException {
        while (true) {
            str = br.readLine();
            if (str.equals("."))
                break;
            boolean isPerfect = true;
            for (int i = 0; i < str.length(); i ++) {
                if (str.charAt(i) == '(') {
                    stack.push(str.charAt(i));
                } else if (str.charAt(i) == '[') {
                    stack.push(str.charAt(i));
                } else if (str.charAt(i) == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isPerfect = false;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (str.charAt(i) == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isPerfect = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (stack.isEmpty() && isPerfect) {
                sb.append("yes").append("\n");
            } else sb.append("no").append("\n");

            stack.clear();
        }

        System.out.println(sb.toString());
    }
}
