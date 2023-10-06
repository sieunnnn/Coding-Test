package baekjoon.step.stackQueueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PROB9012 {
    // 입력이 ) 로 시작하면 무조건 NO

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Stack<Character> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();
    static String str;
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i ++) {
            str = br.readLine();
            if (str.charAt(0) == ')') {
                sb.append("NO").append("\n");
            } else {
                for (int j = 0; j < str.length(); j ++) {
                    if (str.charAt(j) == '(') {
                        stack.push(str.charAt(j));
                    } else {
                        if (stack.size() == 0) { // 맨 앞에만 ) 허용 안됨. (()(())
                            stack.push(str.charAt(j));
                            break;
                        } else stack.pop();
                    }
                }

                if (stack.isEmpty()) {
                    sb.append("YES").append("\n");
                } else {
                    sb.append("NO").append("\n");
                }

                stack.clear();
            }
        }

        System.out.println(sb.toString());
    }
}
