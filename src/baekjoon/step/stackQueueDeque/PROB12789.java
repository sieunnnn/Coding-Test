package baekjoon.step.stackQueueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class PROB12789 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Stack<Integer> stack = new Stack<>();
    static int N;
    static int[] orders;
    static int currOrder = 1;
    static boolean value = true;
    static String answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        orders = new int[N];
        for (int i = 0; i < N; i ++) {
            orders[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i ++) {
            if (orders[i] == currOrder) {
                currOrder ++;
            } else if (!stack.empty() && stack.peek() == currOrder) {
                stack.pop();
                i -- ; // 배열 재검사
                currOrder ++;
            } else {
                stack.push(orders[i]);
            }
        }

        while (stack.size() != 0) {
            if (stack.peek() == currOrder) {
                stack.pop();
                currOrder ++;

            } else {
                value = false;
                break;
            }
        }

        answer = value ? "Nice" : "Sad";
        System.out.println(answer);
    }
}
