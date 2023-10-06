package baekjoon.step.stackQueueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PROB10773 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static Stack<Integer> stack = new Stack<>();
    static int K;
    static int number;
    static int index;
    static int sum = 0;

    public static void main(String[] args) throws IOException {
        K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i ++) {
            number = Integer.parseInt(br.readLine());
            if (number == 0) {
                stack.pop();
            } else {
                stack.add(number);
            }
        }

        index = stack.size();

        for (int i = 0; i < index; i ++) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}
