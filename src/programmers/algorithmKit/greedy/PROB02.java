package programmers.algorithmKit.greedy;

import java.util.*;

public class PROB02 {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            if (k == 0) {
                answer.append(stack.pop());

            } else {
                stack.pop();
                k--;
            }
        }

        return answer.reverse().toString();
    }
}
