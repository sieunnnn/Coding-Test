package baekjoon.level.silver;

import java.util.Scanner;
import java.util.Stack;

public class PROB1874 {
    static Scanner sc = new Scanner(System.in);
    static Stack<Integer> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();
    static int[] sequence;
    static int n;

    public static void main(String[] args) {
        n = sc.nextInt();
        sequence = new int[n];
        for (int i = 0; i < n; i ++) {
            sequence[i] = sc.nextInt();
        }
        solve();
        System.out.println(sb);
    }

    public static void solve() {
        int currentNumber = 1;

        for (int num : sequence) {
            // 현재 숫자가 수열의 숫자보다 작거나 같을 때까지 push
            while (currentNumber <= num) {
                stack.push(currentNumber++);
                sb.append("+").append("\n");
            }

            // 스택의 top이 수열의 현재 숫자와 일치하지 않는 경우
            if (stack.peek() != num) {
                sb.setLength(0); // StringBuilder 초기화
                sb.append("NO");
                return;
            }

            // 스택의 top이 수열의 현재 숫자와 일치하는 경우 pop
            stack.pop();
            sb.append("-").append("\n");
        }
    }
}
